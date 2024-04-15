// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAclEntriesRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Maximum value: 1600.</p>
     * <br>
     * <p>Default value: 1600.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results have been returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the instance to which the ACL applies. You can specify an office network ID or a cloud computer ID.</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The granularity of the ACL.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   desktop: cloud computer</p>
     * <p>*   vpc: office network</p>
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
