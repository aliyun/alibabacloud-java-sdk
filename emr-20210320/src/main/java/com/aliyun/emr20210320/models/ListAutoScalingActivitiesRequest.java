// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the node group.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the scaling activity. Number of elements in the array: 1-20.</p>
     */
    @NameInMap("ScalingActivityStates")
    public java.util.List<String> scalingActivityStates;

    /**
     * <p>The type of the scaling activity. Valid values:</p>
     * <br>
     * <p>*   SCALE_OUT</p>
     * <p>*   SCALE_IN</p>
     */
    @NameInMap("ScalingActivityType")
    public String scalingActivityType;

    /**
     * <p>The name of the scaling rule.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAutoScalingActivitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesRequest self = new ListAutoScalingActivitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAutoScalingActivitiesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAutoScalingActivitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoScalingActivitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoScalingActivitiesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListAutoScalingActivitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAutoScalingActivitiesRequest setScalingActivityStates(java.util.List<String> scalingActivityStates) {
        this.scalingActivityStates = scalingActivityStates;
        return this;
    }
    public java.util.List<String> getScalingActivityStates() {
        return this.scalingActivityStates;
    }

    public ListAutoScalingActivitiesRequest setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ListAutoScalingActivitiesRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ListAutoScalingActivitiesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
