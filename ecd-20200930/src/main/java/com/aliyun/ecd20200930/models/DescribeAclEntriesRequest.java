// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAclEntriesRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Maximum value: 1600.</p>
     * <p>Default value: 1600.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kRxd1mKkNnHlUy14zdjl/I</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the instance to which the ACL applies. You can specify an office network ID or a cloud computer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-****</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The granularity of the ACL.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>desktop: cloud computer</li>
     * <li>vpc: office network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DescribeAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclEntriesRequest self = new DescribeAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAclEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAclEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAclEntriesRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public DescribeAclEntriesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
