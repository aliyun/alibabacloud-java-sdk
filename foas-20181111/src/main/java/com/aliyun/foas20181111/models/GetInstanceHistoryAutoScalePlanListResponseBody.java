// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceHistoryAutoScalePlanListResponseBody extends TeaModel {
    @NameInMap("PlanList")
    public GetInstanceHistoryAutoScalePlanListResponseBodyPlanList planList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceHistoryAutoScalePlanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceHistoryAutoScalePlanListResponseBody self = new GetInstanceHistoryAutoScalePlanListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceHistoryAutoScalePlanListResponseBody setPlanList(GetInstanceHistoryAutoScalePlanListResponseBodyPlanList planList) {
        this.planList = planList;
        return this;
    }
    public GetInstanceHistoryAutoScalePlanListResponseBodyPlanList getPlanList() {
        return this.planList;
    }

    public GetInstanceHistoryAutoScalePlanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceHistoryAutoScalePlanListResponseBodyPlanList extends TeaModel {
        @NameInMap("Plan")
        public java.util.List<String> plan;

        public static GetInstanceHistoryAutoScalePlanListResponseBodyPlanList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceHistoryAutoScalePlanListResponseBodyPlanList self = new GetInstanceHistoryAutoScalePlanListResponseBodyPlanList();
            return TeaModel.build(map, self);
        }

        public GetInstanceHistoryAutoScalePlanListResponseBodyPlanList setPlan(java.util.List<String> plan) {
            this.plan = plan;
            return this;
        }
        public java.util.List<String> getPlan() {
            return this.plan;
        }

    }

}
