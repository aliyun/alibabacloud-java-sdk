// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scaling activities.</p>
     */
    @NameInMap("ScalingActivities")
    public java.util.List<ScalingActivities> scalingActivities;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAutoScalingActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesResponseBody self = new ListAutoScalingActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoScalingActivitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoScalingActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingActivitiesResponseBody setScalingActivities(java.util.List<ScalingActivities> scalingActivities) {
        this.scalingActivities = scalingActivities;
        return this;
    }
    public java.util.List<ScalingActivities> getScalingActivities() {
        return this.scalingActivities;
    }

    public ListAutoScalingActivitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ScalingActivities extends TeaModel {
        /**
         * <p>The ID of the scaling activity.</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <p>The status of the scaling activity. Valid values:</p>
         * <br>
         * <p>*   REJECTED</p>
         * <p>*   SUCCESSFUL</p>
         * <p>*   FAILED</p>
         * <p>*   IN_PROGRESS</p>
         */
        @NameInMap("ActivityState")
        public String activityState;

        /**
         * <p>The type of the scaling activity. Valid values:</p>
         * <br>
         * <p>*   SCALE_OUT</p>
         * <p>*   SCALE_IN</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The description of the scaling activity.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the scaling. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of added or removed instances.</p>
         */
        @NameInMap("ExpectNum")
        public Integer expectNum;

        /**
         * <p>The ID of the node group.</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The name of the node group.</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The operation ID.</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The name of the scaling rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The start time of the scaling. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ScalingActivities build(java.util.Map<String, ?> map) throws Exception {
            ScalingActivities self = new ScalingActivities();
            return TeaModel.build(map, self);
        }

        public ScalingActivities setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public ScalingActivities setActivityState(String activityState) {
            this.activityState = activityState;
            return this;
        }
        public String getActivityState() {
            return this.activityState;
        }

        public ScalingActivities setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public ScalingActivities setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ScalingActivities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ScalingActivities setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ScalingActivities setExpectNum(Integer expectNum) {
            this.expectNum = expectNum;
            return this;
        }
        public Integer getExpectNum() {
            return this.expectNum;
        }

        public ScalingActivities setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ScalingActivities setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ScalingActivities setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ScalingActivities setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ScalingActivities setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
