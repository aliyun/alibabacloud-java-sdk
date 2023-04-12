// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceTimelineRequest extends TeaModel {
    /**
     * <p>The timestamp that specifies the end of the time range to query. The default value is the time when the GetResourceComplianceTimeline operation is called. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request. If the response of the current request is truncated, this token is used to initiate another request and obtain the remaining entries.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a resource, see [ListDiscoveredResources](~~169620~~).</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about how to obtain the type of a resource, see [ListDiscoveredResources](~~169620~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The timestamp that specifies the beginning of the time range to query. By default, Cloud Config retrieves the compliance evaluations in the last 30 days for the specified resource. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetResourceComplianceTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceTimelineRequest self = new GetResourceComplianceTimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceTimelineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetResourceComplianceTimelineRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetResourceComplianceTimelineRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResourceComplianceTimelineRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetResourceComplianceTimelineRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetResourceComplianceTimelineRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceComplianceTimelineRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
