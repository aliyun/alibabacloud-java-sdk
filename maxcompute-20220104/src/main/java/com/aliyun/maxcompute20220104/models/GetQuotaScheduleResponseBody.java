// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaScheduleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetQuotaScheduleResponseBodyData> data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     */
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

    public GetQuotaScheduleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQuotaScheduleResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetQuotaScheduleResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetQuotaScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQuotaScheduleResponseBodyDataCondition extends TeaModel {
        /**
         * <p>The start time when the quota plan takes effect.</p>
         */
        @NameInMap("after")
        public String after;

        /**
         * <p>The time when the quota plan takes effect.</p>
         */
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
        /**
         * <p>The condition value.</p>
         */
        @NameInMap("condition")
        public GetQuotaScheduleResponseBodyDataCondition condition;

        /**
         * <p>The ID of the quota plan.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the operator.</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The name of the quota plan.</p>
         */
        @NameInMap("plan")
        public String plan;

        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The type of the quota plan.</p>
         */
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

        public GetQuotaScheduleResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
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
