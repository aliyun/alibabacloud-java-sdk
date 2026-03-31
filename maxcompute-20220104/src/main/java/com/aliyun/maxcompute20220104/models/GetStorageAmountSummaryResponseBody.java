// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageAmountSummaryResponseBody extends TeaModel {
    @NameInMap("data")
    public GetStorageAmountSummaryResponseBodyData data;

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
     * <p>688003E1-D1B4-5468-957E-2FFB3AC8D79B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetStorageAmountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAmountSummaryResponseBody self = new GetStorageAmountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageAmountSummaryResponseBody setData(GetStorageAmountSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStorageAmountSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetStorageAmountSummaryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStorageAmountSummaryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetStorageAmountSummaryResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetStorageAmountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetStorageAmountSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("unit")
        public java.util.Map<String, String> unit;

        @NameInMap("value")
        public java.util.Map<String, Long> value;

        public static GetStorageAmountSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageAmountSummaryResponseBodyData self = new GetStorageAmountSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStorageAmountSummaryResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetStorageAmountSummaryResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetStorageAmountSummaryResponseBodyData setUnit(java.util.Map<String, String> unit) {
            this.unit = unit;
            return this;
        }
        public java.util.Map<String, String> getUnit() {
            return this.unit;
        }

        public GetStorageAmountSummaryResponseBodyData setValue(java.util.Map<String, Long> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, Long> getValue() {
            return this.value;
        }

    }

}
