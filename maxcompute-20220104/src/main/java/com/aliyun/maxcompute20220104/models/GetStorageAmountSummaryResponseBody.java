// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageAmountSummaryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetStorageAmountSummaryResponseBodyData data;

    /**
     * <p>The business error code or an empty value.</p>
     * <ul>
     * <li>If success is false, a business error code is returned.</li>
     * <li>If success is true, an empty value is returned.</li>
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
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the business is successful. If this parameter is not empty and the value is not 200, the business processing failed.</p>
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
         * <p>The date of the statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The timestamp. This API does not return this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The unit of the storage metrics. This API does not return this parameter.</p>
         */
        @NameInMap("unit")
        public java.util.Map<String, String> unit;

        /**
         * <p>The storage metrics. The metrics include the following:</p>
         * <ul>
         * <li>projectAmount</li>
         * <li>schemaAmount</li>
         * <li>tableAmount</li>
         * <li>partitionAmount</li>
         * </ul>
         */
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
