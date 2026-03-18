// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSizeSummaryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetStorageSizeSummaryResponseBodyData data;

    /**
     * <p>The business error code or an empty value.</p>
     * <ul>
     * <li><p>If success is false, a business error code is returned.</p>
     * </li>
     * <li><p>If success is true, an empty value is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The description of the error.</p>
     * 
     * <strong>example:</strong>
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the business is successful. If this parameter is not empty and the value is not 200, the business fails.</p>
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
         * <p>The date of statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The timestamp of the last data update.</p>
         * 
         * <strong>example:</strong>
         * <p>1749090705919</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The unit of the storage metric usage. It includes:</p>
         * <ul>
         * <li><p>lowFreqStorage</p>
         * </li>
         * <li><p>standardStorage</p>
         * </li>
         * <li><p>longTermStorage</p>
         * </li>
         * <li><p>totalStorage</p>
         * </li>
         * </ul>
         */
        @NameInMap("unit")
        public java.util.Map<String, String> unit;

        /**
         * <p>The storage metrics. It includes:</p>
         * <ul>
         * <li><p>lowFreqStorage</p>
         * </li>
         * <li><p>standardStorage</p>
         * </li>
         * <li><p>longTermStorage</p>
         * </li>
         * <li><p>totalStorage</p>
         * </li>
         * </ul>
         */
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
