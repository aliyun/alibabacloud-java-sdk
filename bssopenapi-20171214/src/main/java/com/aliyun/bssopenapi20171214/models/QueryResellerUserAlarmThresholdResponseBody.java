// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerUserAlarmThresholdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<QueryResellerUserAlarmThresholdResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EAE08A27-386C-579E-966D-8853EC3C5D0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryResellerUserAlarmThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerUserAlarmThresholdResponseBody self = new QueryResellerUserAlarmThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResellerUserAlarmThresholdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryResellerUserAlarmThresholdResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryResellerUserAlarmThresholdResponseBody setData(java.util.List<QueryResellerUserAlarmThresholdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryResellerUserAlarmThresholdResponseBodyData> getData() {
        return this.data;
    }

    public QueryResellerUserAlarmThresholdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryResellerUserAlarmThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResellerUserAlarmThresholdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryResellerUserAlarmThresholdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Denominator")
        public Integer denominator;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Numerator")
        public Integer numerator;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ThresholdAmount")
        public String thresholdAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ThresholdType")
        public Integer thresholdType;

        public static QueryResellerUserAlarmThresholdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryResellerUserAlarmThresholdResponseBodyData self = new QueryResellerUserAlarmThresholdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryResellerUserAlarmThresholdResponseBodyData setDenominator(Integer denominator) {
            this.denominator = denominator;
            return this;
        }
        public Integer getDenominator() {
            return this.denominator;
        }

        public QueryResellerUserAlarmThresholdResponseBodyData setNumerator(Integer numerator) {
            this.numerator = numerator;
            return this;
        }
        public Integer getNumerator() {
            return this.numerator;
        }

        public QueryResellerUserAlarmThresholdResponseBodyData setThresholdAmount(String thresholdAmount) {
            this.thresholdAmount = thresholdAmount;
            return this;
        }
        public String getThresholdAmount() {
            return this.thresholdAmount;
        }

        public QueryResellerUserAlarmThresholdResponseBodyData setThresholdType(Integer thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public Integer getThresholdType() {
            return this.thresholdType;
        }

    }

}
