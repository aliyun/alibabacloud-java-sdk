// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDashboardMetricsResponseBodyResult> result;

    public static ListDashboardMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsResponseBody self = new ListDashboardMetricsResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Val")
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
        @NameInMap("Total")
        public java.util.Map<String, ?> total;

        @NameInMap("Detail")
        public java.util.List<ListDashboardMetricsResponseBodyResultDetail> detail;

        public static ListDashboardMetricsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardMetricsResponseBodyResult self = new ListDashboardMetricsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardMetricsResponseBodyResult setTotal(java.util.Map<String, ?> total) {
            this.total = total;
            return this;
        }
        public java.util.Map<String, ?> getTotal() {
            return this.total;
        }

        public ListDashboardMetricsResponseBodyResult setDetail(java.util.List<ListDashboardMetricsResponseBodyResultDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListDashboardMetricsResponseBodyResultDetail> getDetail() {
            return this.detail;
        }

    }

}
