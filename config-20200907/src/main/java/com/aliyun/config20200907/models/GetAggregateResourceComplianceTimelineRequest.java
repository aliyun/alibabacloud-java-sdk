// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceTimelineRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-5885626622af0008****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The end timestamp. By default, data up to the current time is queried. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1625821156000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>If the output of a request is truncated, you can use this token to query the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>5OVS5J4I1/UKTkHV5oNs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides.</p>
     * <p>For more information about how to obtain the ID of the region where a resource resides, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource in the account group belongs.</p>
     * <blockquote>
     * <p>Set either the ResourceAccountId or ResourceOwnerId parameter. This parameter is recommended.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The resource ID.</p>
     * <p>For more information about how to obtain the resource ID, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new-bucket</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The resource type.</p>
     * <p>For more information about how to obtain the resource type, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::OSS::Bucket</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start timestamp. By default, data from the last 30 days is queried. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1623211156000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetAggregateResourceComplianceTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceTimelineRequest self = new GetAggregateResourceComplianceTimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceTimelineRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceComplianceTimelineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAggregateResourceComplianceTimelineRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetAggregateResourceComplianceTimelineRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAggregateResourceComplianceTimelineRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateResourceComplianceTimelineRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public GetAggregateResourceComplianceTimelineRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    @Deprecated
    public GetAggregateResourceComplianceTimelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAggregateResourceComplianceTimelineRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetAggregateResourceComplianceTimelineRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
