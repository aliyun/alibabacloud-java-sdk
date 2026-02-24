// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceConfigurationTimelineRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-5885626622af0008****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The end time of the query. This is a UNIX timestamp in milliseconds. By default, data up to the current time is queried.</p>
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
     * <p>If the output is truncated, you can use the <code>NextToken</code> to start the next query from the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the resource in the account group.</p>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The ID of the resource.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
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
     * <p>The type of the resource.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::OSS::Bucket</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start time of the query. This is a UNIX timestamp in milliseconds. By default, data from the last 30 days is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1623211156000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetAggregateResourceConfigurationTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceConfigurationTimelineRequest self = new GetAggregateResourceConfigurationTimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceConfigurationTimelineRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceConfigurationTimelineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAggregateResourceConfigurationTimelineRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetAggregateResourceConfigurationTimelineRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAggregateResourceConfigurationTimelineRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateResourceConfigurationTimelineRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public GetAggregateResourceConfigurationTimelineRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    @Deprecated
    public GetAggregateResourceConfigurationTimelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAggregateResourceConfigurationTimelineRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetAggregateResourceConfigurationTimelineRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
