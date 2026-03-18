// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaScheduleResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetComputeQuotaScheduleResponseBodyData> data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    public static GetComputeQuotaScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeQuotaScheduleResponseBody self = new GetComputeQuotaScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeQuotaScheduleResponseBody setData(java.util.List<GetComputeQuotaScheduleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetComputeQuotaScheduleResponseBodyData> getData() {
        return this.data;
    }

    public GetComputeQuotaScheduleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetComputeQuotaScheduleResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetComputeQuotaScheduleResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetComputeQuotaScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetComputeQuotaScheduleResponseBodyDataCondition extends TeaModel {
        @NameInMap("at")
        public String at;

        public static GetComputeQuotaScheduleResponseBodyDataCondition build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaScheduleResponseBodyDataCondition self = new GetComputeQuotaScheduleResponseBodyDataCondition();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaScheduleResponseBodyDataCondition setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

    }

    public static class GetComputeQuotaScheduleResponseBodyData extends TeaModel {
        @NameInMap("condition")
        public GetComputeQuotaScheduleResponseBodyDataCondition condition;

        @NameInMap("id")
        public String id;

        @NameInMap("plan")
        public String plan;

        @NameInMap("timezone")
        public String timezone;

        @NameInMap("type")
        public String type;

        public static GetComputeQuotaScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaScheduleResponseBodyData self = new GetComputeQuotaScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaScheduleResponseBodyData setCondition(GetComputeQuotaScheduleResponseBodyDataCondition condition) {
            this.condition = condition;
            return this;
        }
        public GetComputeQuotaScheduleResponseBodyDataCondition getCondition() {
            return this.condition;
        }

        public GetComputeQuotaScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetComputeQuotaScheduleResponseBodyData setPlan(String plan) {
            this.plan = plan;
            return this;
        }
        public String getPlan() {
            return this.plan;
        }

        public GetComputeQuotaScheduleResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetComputeQuotaScheduleResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
