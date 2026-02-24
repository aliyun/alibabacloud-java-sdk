// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineRequest extends TeaModel {
    /**
     * <p>The end timestamp of the time range to query. The value is a UNIX timestamp in milliseconds. If you do not specify this parameter, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1625821156000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the response of the current request is truncated, you can use this token to retrieve the next page of results.</p>
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
     * <p>The ID of the resource.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new-bucket</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169620.html">ListDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::OSS::Bucket</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start timestamp of the time range to query. The value is a UNIX timestamp in milliseconds. If you do not specify this parameter, the query starts from 30 days before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1623211156000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetResourceConfigurationTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationTimelineRequest self = new GetResourceConfigurationTimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationTimelineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetResourceConfigurationTimelineRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetResourceConfigurationTimelineRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResourceConfigurationTimelineRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetResourceConfigurationTimelineRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetResourceConfigurationTimelineRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceConfigurationTimelineRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
