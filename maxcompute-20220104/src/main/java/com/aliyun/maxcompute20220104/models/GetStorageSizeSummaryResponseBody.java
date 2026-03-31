// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSizeSummaryResponseBody extends TeaModel {
    @NameInMap("data")
    public GetStorageSizeSummaryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0be3e0aa16667684362147582e038f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetStorageSizeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSizeSummaryResponseBody self = new GetStorageSizeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageSizeSummaryResponseBody setData(GetStorageSizeSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStorageSizeSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetStorageSizeSummaryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStorageSizeSummaryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetStorageSizeSummaryResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetStorageSizeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetStorageSizeSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>1749090705919</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("unit")
        public java.util.Map<String, String> unit;

        @NameInMap("value")
        public java.util.Map<String, Double> value;

        public static GetStorageSizeSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageSizeSummaryResponseBodyData self = new GetStorageSizeSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStorageSizeSummaryResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetStorageSizeSummaryResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetStorageSizeSummaryResponseBodyData setUnit(java.util.Map<String, String> unit) {
            this.unit = unit;
            return this;
        }
        public java.util.Map<String, String> getUnit() {
            return this.unit;
        }

        public GetStorageSizeSummaryResponseBodyData setValue(java.util.Map<String, Double> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, Double> getValue() {
            return this.value;
        }

    }

}
