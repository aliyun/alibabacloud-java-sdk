// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeUserTagValuesRequest extends TeaModel {
    /**
     * <p>Number of items per page in a paginated query. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If no value is set or the set value is less than 10, the default value is 10.</p>
     * </li>
     * <li><p>If the set value is greater than 100, the default value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Query token (Token). The value should be the NextToken parameter value from the previous call to this interface. This parameter is not required for the initial call. If NextToken is set, the PageSize and PageNumber request parameters become invalid, and the TotalCount in the response data is also invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the consistency replication group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Tag content filter</p>
     * 
     * <strong>example:</strong>
     * <p>keyValue</p>
     */
    @NameInMap("TagFilterValue")
    public String tagFilterValue;

    /**
     * <p>Tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>TestKey</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    public static DescribeUserTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagValuesRequest self = new DescribeUserTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagValuesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserTagValuesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserTagValuesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserTagValuesRequest setTagFilterValue(String tagFilterValue) {
        this.tagFilterValue = tagFilterValue;
        return this;
    }
    public String getTagFilterValue() {
        return this.tagFilterValue;
    }

    public DescribeUserTagValuesRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

}
