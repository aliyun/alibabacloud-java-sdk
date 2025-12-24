// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveValueResponseBody extends TeaModel {
    @NameInMap("PredictiveValues")
    public QueryPredictiveValueResponseBodyPredictiveValues predictiveValues;

    /**
     * <strong>example:</strong>
     * <p>FA5F448E-DC84-5EBC-B6D5-F659ADxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPredictiveValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveValueResponseBody self = new QueryPredictiveValueResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveValueResponseBody setPredictiveValues(QueryPredictiveValueResponseBodyPredictiveValues predictiveValues) {
        this.predictiveValues = predictiveValues;
        return this;
    }
    public QueryPredictiveValueResponseBodyPredictiveValues getPredictiveValues() {
        return this.predictiveValues;
    }

    public QueryPredictiveValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-17T10:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue build(java.util.Map<String, ?> map) throws Exception {
            QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue self = new QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue();
            return TeaModel.build(map, self);
        }

        public QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryPredictiveValueResponseBodyPredictiveValues extends TeaModel {
        @NameInMap("PredictiveValue")
        public java.util.List<QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue> predictiveValue;

        public static QueryPredictiveValueResponseBodyPredictiveValues build(java.util.Map<String, ?> map) throws Exception {
            QueryPredictiveValueResponseBodyPredictiveValues self = new QueryPredictiveValueResponseBodyPredictiveValues();
            return TeaModel.build(map, self);
        }

        public QueryPredictiveValueResponseBodyPredictiveValues setPredictiveValue(java.util.List<QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue> predictiveValue) {
            this.predictiveValue = predictiveValue;
            return this;
        }
        public java.util.List<QueryPredictiveValueResponseBodyPredictiveValuesPredictiveValue> getPredictiveValue() {
            return this.predictiveValue;
        }

    }

}
