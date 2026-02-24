// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceTimelineRequest extends TeaModel {
    /**
     * <p>The end timestamp. If you do not set this parameter, the system queries data generated up to the time of the API call. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1625821156000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries to return on a single page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return value is truncated, use this token to initiate another request to retrieve the remaining entries.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource ID.</p>
     * <p>For more information about how to obtain the resource ID, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new-bucket</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <p>For more information about how to obtain the resource type, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::OSS::Bucket</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start timestamp. If you do not set this parameter, the system queries data from the last 30 days. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1623211156000</p>
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
