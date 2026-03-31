// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaScheduleResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public java.util.List<GetComputeQuotaScheduleResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>QUOTA_UNKNOWN_NICKNAME</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Cannot found quota **</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B42CA730-8187-50F1-9FE0-6733297036DB</p>
     */
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
        /**
         * <p>The start time when the quota plan takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
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
        /**
         * <p>The value of effective condition.</p>
         */
        @NameInMap("condition")
        public GetComputeQuotaScheduleResponseBodyDataCondition condition;

        /**
         * <p>The ID of the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>89b54db44d384f26964951ea457f64a5</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("plan")
        public String plan;

        /**
         * <p>The time zone property.</p>
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
         * <p>daily</p>
         */
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
