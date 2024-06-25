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
         * 
         * <strong>example:</strong>
         * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The time when the operation plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T20:01:22+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The expected end time of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-22T18:00:00+08:00</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <p>The operation plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P-655c9c127e0e6603ef00****</p>
         */
        @NameInMap("plan_id")
        public String planId;

        /**
         * <p>The expected start time of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-22T15:18:00+08:00</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <p>The plan status. Valid values:</p>
         * <ul>
         * <li>scheduled</li>
         * <li>Canceled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scheduled</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The target ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
         */
        @NameInMap("target_id")
        public String targetId;

        /**
         * <p>The target type.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("target_type")
        public String targetType;

        /**
         * <p>The plan type. Valid values:</p>
         * <ul>
         * <li>cluster_upgrade</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster_upgrade</p>
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
