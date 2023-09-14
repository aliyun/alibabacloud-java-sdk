// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesResponseBody extends TeaModel {
    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingActivities")
    public java.util.List<ScalingActivities> scalingActivities;

    /**
     * <p>本次请求条件下的数据总量。</p>
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
         * <p>伸缩活动ID。</p>
         */
        @NameInMap("ActivityId")
        public String activityId;

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
         * <p>伸缩规则名称。</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>伸缩启动时间。</p>
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
