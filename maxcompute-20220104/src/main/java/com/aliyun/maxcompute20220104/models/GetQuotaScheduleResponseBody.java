// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaScheduleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetQuotaScheduleResponseBodyData> data;

    /**
     * <ul>
     * <li>If the value of success was false, an error code was returned.</li>
     * <li>If the value of success was true, a null value was returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>errorMsg</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc059b716696296266308790e0d3e</p>
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
         * 
         * <strong>example:</strong>
         * <p>2022-04-25T04:23:04Z</p>
         */
        @NameInMap("after")
        public String after;

        /**
         * <p>The time when the quota plan takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0900</p>
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
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The name of the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("plan")
        public String plan;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The type of the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>once</p>
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
