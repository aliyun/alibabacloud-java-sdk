// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeUserTagKeysRequest extends TeaModel {
    /**
     * <p>Number of items per page in paginated queries. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If no value is set or the set value is less than 10, the default is 10.</p>
     * </li>
     * <li><p>If the set value is greater than 100, the default is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token returned by this call (Token).</p>
     * 
     * <strong>example:</strong>
     * <p>f07b150eadfa1d7a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region to which the resource belongs. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tagKey for filtering the query.</p>
     * 
     * <strong>example:</strong>
     * <p>tagKey</p>
     */
    @NameInMap("TagFilterKey")
    public String tagFilterKey;

    public static DescribeUserTagKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagKeysRequest self = new DescribeUserTagKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagKeysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserTagKeysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserTagKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserTagKeysRequest setTagFilterKey(String tagFilterKey) {
        this.tagFilterKey = tagFilterKey;
        return this;
    }
    public String getTagFilterKey() {
        return this.tagFilterKey;
    }

}
