// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListOperationPlansResponseBody extends TeaModel {
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
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("created")
        public String created;

        @NameInMap("end_time")
        public String endTime;

        @NameInMap("plan_id")
        public String planId;

        @NameInMap("start_time")
        public String startTime;

        @NameInMap("state")
        public String state;

        @NameInMap("target_id")
        public String targetId;

        @NameInMap("target_type")
        public String targetType;

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
