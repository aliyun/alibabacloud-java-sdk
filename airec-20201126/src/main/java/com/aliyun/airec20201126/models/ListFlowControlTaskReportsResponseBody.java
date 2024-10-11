// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskReportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16B78383-2803-4964-9605-37B30C073B0E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ListFlowControlTaskReportsResponseBodyResult result;

    public static ListFlowControlTaskReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskReportsResponseBody self = new ListFlowControlTaskReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlTaskReportsResponseBody setResult(ListFlowControlTaskReportsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListFlowControlTaskReportsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListFlowControlTaskReportsResponseBodyResultMetricsDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1664035200</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1664000452</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("val")
        public Long val;

        public static ListFlowControlTaskReportsResponseBodyResultMetricsDetails build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskReportsResponseBodyResultMetricsDetails self = new ListFlowControlTaskReportsResponseBodyResultMetricsDetails();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskReportsResponseBodyResultMetricsDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListFlowControlTaskReportsResponseBodyResultMetricsDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListFlowControlTaskReportsResponseBodyResultMetricsDetails setVal(Long val) {
            this.val = val;
            return this;
        }
        public Long getVal() {
            return this.val;
        }

    }

    public static class ListFlowControlTaskReportsResponseBodyResultMetrics extends TeaModel {
        @NameInMap("details")
        public java.util.List<ListFlowControlTaskReportsResponseBodyResultMetricsDetails> details;

        /**
         * <strong>example:</strong>
         * <p>taskPv</p>
         */
        @NameInMap("type")
        public String type;

        public static ListFlowControlTaskReportsResponseBodyResultMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskReportsResponseBodyResultMetrics self = new ListFlowControlTaskReportsResponseBodyResultMetrics();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskReportsResponseBodyResultMetrics setDetails(java.util.List<ListFlowControlTaskReportsResponseBodyResultMetricsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListFlowControlTaskReportsResponseBodyResultMetricsDetails> getDetails() {
            return this.details;
        }

        public ListFlowControlTaskReportsResponseBodyResultMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFlowControlTaskReportsResponseBodyResultTotal extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("InvalidPercent")
        public Double invalidPercent;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("accTaskCtr")
        public Double accTaskCtr;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("accTaskPv")
        public Long accTaskPv;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("accTotalCtr")
        public Double accTotalCtr;

        public static ListFlowControlTaskReportsResponseBodyResultTotal build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskReportsResponseBodyResultTotal self = new ListFlowControlTaskReportsResponseBodyResultTotal();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskReportsResponseBodyResultTotal setInvalidPercent(Double invalidPercent) {
            this.invalidPercent = invalidPercent;
            return this;
        }
        public Double getInvalidPercent() {
            return this.invalidPercent;
        }

        public ListFlowControlTaskReportsResponseBodyResultTotal setAccTaskCtr(Double accTaskCtr) {
            this.accTaskCtr = accTaskCtr;
            return this;
        }
        public Double getAccTaskCtr() {
            return this.accTaskCtr;
        }

        public ListFlowControlTaskReportsResponseBodyResultTotal setAccTaskPv(Long accTaskPv) {
            this.accTaskPv = accTaskPv;
            return this;
        }
        public Long getAccTaskPv() {
            return this.accTaskPv;
        }

        public ListFlowControlTaskReportsResponseBodyResultTotal setAccTotalCtr(Double accTotalCtr) {
            this.accTotalCtr = accTotalCtr;
            return this;
        }
        public Double getAccTotalCtr() {
            return this.accTotalCtr;
        }

    }

    public static class ListFlowControlTaskReportsResponseBodyResult extends TeaModel {
        @NameInMap("metrics")
        public java.util.List<ListFlowControlTaskReportsResponseBodyResultMetrics> metrics;

        @NameInMap("total")
        public ListFlowControlTaskReportsResponseBodyResultTotal total;

        public static ListFlowControlTaskReportsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskReportsResponseBodyResult self = new ListFlowControlTaskReportsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskReportsResponseBodyResult setMetrics(java.util.List<ListFlowControlTaskReportsResponseBodyResultMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListFlowControlTaskReportsResponseBodyResultMetrics> getMetrics() {
            return this.metrics;
        }

        public ListFlowControlTaskReportsResponseBodyResult setTotal(ListFlowControlTaskReportsResponseBodyResultTotal total) {
            this.total = total;
            return this;
        }
        public ListFlowControlTaskReportsResponseBodyResultTotal getTotal() {
            return this.total;
        }

    }

}
