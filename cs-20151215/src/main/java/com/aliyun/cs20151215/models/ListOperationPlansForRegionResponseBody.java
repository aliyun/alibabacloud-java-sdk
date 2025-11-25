// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListOperationPlansForRegionResponseBody extends TeaModel {
    @NameInMap("plans")
    public java.util.List<ListOperationPlansForRegionResponseBodyPlans> plans;

    public static ListOperationPlansForRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationPlansForRegionResponseBody self = new ListOperationPlansForRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationPlansForRegionResponseBody setPlans(java.util.List<ListOperationPlansForRegionResponseBodyPlans> plans) {
        this.plans = plans;
        return this;
    }
    public java.util.List<ListOperationPlansForRegionResponseBodyPlans> getPlans() {
        return this.plans;
    }

    public static class ListOperationPlansForRegionResponseBodyPlansStateReason extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static ListOperationPlansForRegionResponseBodyPlansStateReason build(java.util.Map<String, ?> map) throws Exception {
            ListOperationPlansForRegionResponseBodyPlansStateReason self = new ListOperationPlansForRegionResponseBodyPlansStateReason();
            return TeaModel.build(map, self);
        }

        public ListOperationPlansForRegionResponseBodyPlansStateReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListOperationPlansForRegionResponseBodyPlansStateReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListOperationPlansForRegionResponseBodyPlans extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>2023-11-21T20:01:22+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <strong>example:</strong>
         * <p>2023-11-22T18:00:00+08:00</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>P-655c9c127e0e6603ef00****</p>
         */
        @NameInMap("plan_id")
        public String planId;

        /**
         * <strong>example:</strong>
         * <p>2023-11-22T15:18:00+08:00</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("state_reason")
        public ListOperationPlansForRegionResponseBodyPlansStateReason stateReason;

        /**
         * <strong>example:</strong>
         * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
         */
        @NameInMap("target_id")
        public String targetId;

        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("target_type")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>T-681ac448b23ced010600****</p>
         */
        @NameInMap("task_id")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>CLUSTER_UPGRADE_MASTER</p>
         */
        @NameInMap("type")
        public String type;

        public static ListOperationPlansForRegionResponseBodyPlans build(java.util.Map<String, ?> map) throws Exception {
            ListOperationPlansForRegionResponseBodyPlans self = new ListOperationPlansForRegionResponseBodyPlans();
            return TeaModel.build(map, self);
        }

        public ListOperationPlansForRegionResponseBodyPlans setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListOperationPlansForRegionResponseBodyPlans setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListOperationPlansForRegionResponseBodyPlans setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListOperationPlansForRegionResponseBodyPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListOperationPlansForRegionResponseBodyPlans setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListOperationPlansForRegionResponseBodyPlans setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListOperationPlansForRegionResponseBodyPlans setStateReason(ListOperationPlansForRegionResponseBodyPlansStateReason stateReason) {
            this.stateReason = stateReason;
            return this;
        }
        public ListOperationPlansForRegionResponseBodyPlansStateReason getStateReason() {
            return this.stateReason;
        }

        public ListOperationPlansForRegionResponseBodyPlans setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListOperationPlansForRegionResponseBodyPlans setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListOperationPlansForRegionResponseBodyPlans setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOperationPlansForRegionResponseBodyPlans setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
