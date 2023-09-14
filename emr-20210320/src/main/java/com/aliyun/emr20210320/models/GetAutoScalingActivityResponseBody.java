// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <p>伸缩活动ID。</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

        /**
         * <p>本次伸缩活动对应的实例列表。</p>
         */
        @NameInMap("ActivityResults")
        public java.util.List<ScalingActivityResult> activityResults;

        /**
         * <p>伸缩活动状态。取值范围：</p>
         * <p>- REJECTED：拒绝</p>
         * <p>- SUCCESSFUL：成功</p>
         * <p>- FAILED：失败</p>
         * <p>- IN_PROGRESS：进行中</p>
         */
        @NameInMap("ActivityState")
        public String activityState;

        /**
         * <p>伸缩活动类型。取值范围：</p>
         * <p>- SCALE_IN：缩容</p>
         * <p>- SCALE_OUT：扩容</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>集群ID。</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>伸缩活动描述。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>伸缩结束时间。</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>本次扩缩数量。</p>
         */
        @NameInMap("ExpectNum")
        public Integer expectNum;

        /**
         * <p>节点组ID。</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>节点组名称。</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>操作ID。</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>伸缩规则详述。</p>
         */
        @NameInMap("RuleDetail")
        public ScalingRule ruleDetail;

        /**
         * <p>伸缩规则名称。</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>伸缩启动时间。</p>
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
