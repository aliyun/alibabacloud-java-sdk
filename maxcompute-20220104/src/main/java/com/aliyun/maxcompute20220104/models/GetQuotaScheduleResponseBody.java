// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaScheduleResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetQuotaScheduleResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    public static GetQuotaScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaScheduleResponseBody self = new GetQuotaScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaScheduleResponseBody setData(java.util.List<GetQuotaScheduleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQuotaScheduleResponseBodyData> getData() {
        return this.data;
    }

    public GetQuotaScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQuotaScheduleResponseBodyDataCondition extends TeaModel {
        @NameInMap("after")
        public String after;

        @NameInMap("at")
        public String at;

        public static GetQuotaScheduleResponseBodyDataCondition build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaScheduleResponseBodyDataCondition self = new GetQuotaScheduleResponseBodyDataCondition();
            return TeaModel.build(map, self);
        }

        public GetQuotaScheduleResponseBodyDataCondition setAfter(String after) {
            this.after = after;
            return this;
        }
        public String getAfter() {
            return this.after;
        }

        public GetQuotaScheduleResponseBodyDataCondition setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

    }

    public static class GetQuotaScheduleResponseBodyData extends TeaModel {
        @NameInMap("condition")
        public GetQuotaScheduleResponseBodyDataCondition condition;

        @NameInMap("id")
        public String id;

        @NameInMap("operator")
        public String operator;

        @NameInMap("plan")
        public String plan;

        @NameInMap("type")
        public String type;

        public static GetQuotaScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaScheduleResponseBodyData self = new GetQuotaScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQuotaScheduleResponseBodyData setCondition(GetQuotaScheduleResponseBodyDataCondition condition) {
            this.condition = condition;
            return this;
        }
        public GetQuotaScheduleResponseBodyDataCondition getCondition() {
            return this.condition;
        }

        public GetQuotaScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaScheduleResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQuotaScheduleResponseBodyData setPlan(String plan) {
            this.plan = plan;
            return this;
        }
        public String getPlan() {
            return this.plan;
        }

        public GetQuotaScheduleResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
