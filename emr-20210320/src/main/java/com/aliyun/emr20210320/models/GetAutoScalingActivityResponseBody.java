// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the scaling activity.</p>
     */
    @NameInMap("ScalingActivity")
    public ScalingActivity scalingActivity;

    public static GetAutoScalingActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityResponseBody self = new GetAutoScalingActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingActivityResponseBody setScalingActivity(ScalingActivity scalingActivity) {
        this.scalingActivity = scalingActivity;
        return this;
    }
    public ScalingActivity getScalingActivity() {
        return this.scalingActivity;
    }

    public static class ScalingActivity extends TeaModel {
        /**
         * <p>The ID of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-36373b084d6b4b13aa50f4129a9e****</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <p>The instances that correspond to the scaling activity.</p>
         */
        @NameInMap("ActivityResults")
        public java.util.List<ScalingActivityResult> activityResults;

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
         * <p>The type of the scaling activity. Valid value:</p>
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
         * <p>The time when scaling ended.</p>
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
         * <p>The description of the scaling rule.</p>
         */
        @NameInMap("RuleDetail")
        public ScalingRule ruleDetail;

        /**
         * <p>The name of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scaling-out-memory</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The time when scaling started.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634819</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ScalingActivity build(java.util.Map<String, ?> map) throws Exception {
            ScalingActivity self = new ScalingActivity();
            return TeaModel.build(map, self);
        }

        public ScalingActivity setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public ScalingActivity setActivityResults(java.util.List<ScalingActivityResult> activityResults) {
            this.activityResults = activityResults;
            return this;
        }
        public java.util.List<ScalingActivityResult> getActivityResults() {
            return this.activityResults;
        }

        public ScalingActivity setActivityState(String activityState) {
            this.activityState = activityState;
            return this;
        }
        public String getActivityState() {
            return this.activityState;
        }

        public ScalingActivity setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public ScalingActivity setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ScalingActivity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ScalingActivity setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ScalingActivity setExpectNum(Integer expectNum) {
            this.expectNum = expectNum;
            return this;
        }
        public Integer getExpectNum() {
            return this.expectNum;
        }

        public ScalingActivity setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ScalingActivity setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ScalingActivity setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ScalingActivity setRuleDetail(ScalingRule ruleDetail) {
            this.ruleDetail = ruleDetail;
            return this;
        }
        public ScalingRule getRuleDetail() {
            return this.ruleDetail;
        }

        public ScalingActivity setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ScalingActivity setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
