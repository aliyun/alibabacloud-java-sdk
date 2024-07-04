// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * 
         * <strong>example:</strong>
         * <p>asa-36373b084d6b4b13aa50f4129a9e****</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <p>The status of the scaling activity. Valid values:</p>
         * <ul>
         * <li>REJECTED</li>
         * <li>SUCCESSFUL</li>
         * <li>FAILED</li>
         * <li>IN_PROGRESS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_PROGRESS</p>
         */
        @NameInMap("ActivityState")
        public String activityState;

        /**
         * <p>The type of the scaling activity. Valid values:</p>
         * <ul>
         * <li>SCALE_OUT</li>
         * <li>SCALE_IN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The description of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterId not exist</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the scaling. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639715634819</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of added or removed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ExpectNum")
        public Integer expectNum;

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The name of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>task-01</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-13c37a77c505****</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The name of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scaling-out-memory</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The start time of the scaling. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634819</p>
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
