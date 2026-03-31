// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetStorageSummaryComparedResponseBody extends TeaModel {
    @NameInMap("data")
    public GetStorageSummaryComparedResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>plan \&quot;***\&quot; does not exist</p>
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
     * <p>0bc3b4b016674434996033675e71ee</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetStorageSummaryComparedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSummaryComparedResponseBody self = new GetStorageSummaryComparedResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageSummaryComparedResponseBody setData(GetStorageSummaryComparedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStorageSummaryComparedResponseBodyData getData() {
        return this.data;
    }

    public GetStorageSummaryComparedResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStorageSummaryComparedResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetStorageSummaryComparedResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetStorageSummaryComparedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetStorageSummaryComparedResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20250601</p>
         */
        @NameInMap("beginDate")
        public String beginDate;

        /**
         * <strong>example:</strong>
         * <p>20250604</p>
         */
        @NameInMap("endDate")
        public String endDate;

        @NameInMap("rate")
        public java.util.Map<String, Double> rate;

        @NameInMap("unit")
        public java.util.Map<String, String> unit;

        @NameInMap("value")
        public java.util.Map<String, Double> value;

        public static GetStorageSummaryComparedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageSummaryComparedResponseBodyData self = new GetStorageSummaryComparedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStorageSummaryComparedResponseBodyData setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetStorageSummaryComparedResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetStorageSummaryComparedResponseBodyData setRate(java.util.Map<String, Double> rate) {
            this.rate = rate;
            return this;
        }
        public java.util.Map<String, Double> getRate() {
            return this.rate;
        }

        public GetStorageSummaryComparedResponseBodyData setUnit(java.util.Map<String, String> unit) {
            this.unit = unit;
            return this;
        }
        public java.util.Map<String, String> getUnit() {
            return this.unit;
        }

        public GetStorageSummaryComparedResponseBodyData setValue(java.util.Map<String, Double> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, Double> getValue() {
            return this.value;
        }

    }

}
