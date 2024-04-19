// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListOperationPlansResponseBody extends TeaModel {
    /**
     * <p>The operation plans.</p>
     */
    @NameInMap("plans")
    public java.util.List<ListOperationPlansResponseBodyPlans> plans;

    public static ListOperationPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationPlansResponseBody self = new ListOperationPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationPlansResponseBody setPlans(java.util.List<ListOperationPlansResponseBodyPlans> plans) {
        this.plans = plans;
        return this;
    }
    public java.util.List<ListOperationPlansResponseBodyPlans> getPlans() {
        return this.plans;
    }

    public static class ListOperationPlansResponseBodyPlans extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The time when the operation plan was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The expected end time of the plan.</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <p>The operation plan ID.</p>
         */
        @NameInMap("plan_id")
        public String planId;

        /**
         * <p>The expected start time of the plan.</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <p>The plan status. Valid values:</p>
         * <br>
         * <p>*   scheduled</p>
         * <p>*   Canceled</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The target ID.</p>
         */
        @NameInMap("target_id")
        public String targetId;

        /**
         * <p>The target type.</p>
         */
        @NameInMap("target_type")
        public String targetType;

        /**
         * <p>The plan type. Valid values:</p>
         * <br>
         * <p>*   cluster_upgrade</p>
         */
        @NameInMap("type")
        public String type;

        public static ListOperationPlansResponseBodyPlans build(java.util.Map<String, ?> map) throws Exception {
            ListOperationPlansResponseBodyPlans self = new ListOperationPlansResponseBodyPlans();
            return TeaModel.build(map, self);
        }

        public ListOperationPlansResponseBodyPlans setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListOperationPlansResponseBodyPlans setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListOperationPlansResponseBodyPlans setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListOperationPlansResponseBodyPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListOperationPlansResponseBodyPlans setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListOperationPlansResponseBodyPlans setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListOperationPlansResponseBodyPlans setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListOperationPlansResponseBodyPlans setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListOperationPlansResponseBodyPlans setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
