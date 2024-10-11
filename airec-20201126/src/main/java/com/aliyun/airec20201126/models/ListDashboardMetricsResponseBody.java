// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsResponseBody extends TeaModel {
    /**
     * <p><strong>null</strong></p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The specific value of the metric.</p>
     */
    @NameInMap("result")
    public java.util.List<ListDashboardMetricsResponseBodyResult> result;

    public static ListDashboardMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsResponseBody self = new ListDashboardMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDashboardMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardMetricsResponseBody setResult(java.util.List<ListDashboardMetricsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDashboardMetricsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDashboardMetricsResponseBodyResultDetail extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1586673466</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("val")
        public String val;

        public static ListDashboardMetricsResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardMetricsResponseBodyResultDetail self = new ListDashboardMetricsResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public ListDashboardMetricsResponseBodyResultDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDashboardMetricsResponseBodyResultDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDashboardMetricsResponseBodyResultDetail setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

    }

    public static class ListDashboardMetricsResponseBodyResult extends TeaModel {
        /**
         * <p>The end time. The value is a timestamp in seconds.</p>
         */
        @NameInMap("detail")
        public java.util.List<ListDashboardMetricsResponseBodyResultDetail> detail;

        /**
         * <p>The start time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("total")
        public java.util.Map<String, ?> total;

        public static ListDashboardMetricsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardMetricsResponseBodyResult self = new ListDashboardMetricsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardMetricsResponseBodyResult setDetail(java.util.List<ListDashboardMetricsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListDashboardMetricsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

        public ListDashboardMetricsResponseBodyResult setTotal(java.util.Map<String, ?> total) {
            this.total = total;
            return this;
        }
        public java.util.Map<String, ?> getTotal() {
            return this.total;
        }

    }

}
