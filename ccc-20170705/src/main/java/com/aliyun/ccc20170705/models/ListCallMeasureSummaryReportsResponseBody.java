// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallMeasureSummaryReportsResponseBody extends TeaModel {
    @NameInMap("CallMeasureSummaryReportList")
    public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList callMeasureSummaryReportList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListCallMeasureSummaryReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallMeasureSummaryReportsResponseBody self = new ListCallMeasureSummaryReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallMeasureSummaryReportsResponseBody setCallMeasureSummaryReportList(ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList callMeasureSummaryReportList) {
        this.callMeasureSummaryReportList = callMeasureSummaryReportList;
        return this;
    }
    public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList getCallMeasureSummaryReportList() {
        return this.callMeasureSummaryReportList;
    }

    public ListCallMeasureSummaryReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallMeasureSummaryReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallMeasureSummaryReportsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallMeasureSummaryReportsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallMeasureSummaryReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport extends TeaModel {
        @NameInMap("Day")
        public String day;

        @NameInMap("Year")
        public String year;

        @NameInMap("InboundDurationByMinute")
        public Long inboundDurationByMinute;

        @NameInMap("OutboundCount")
        public Long outboundCount;

        @NameInMap("OutboundDurationByMinute")
        public Long outboundDurationByMinute;

        @NameInMap("InboundCount")
        public Long inboundCount;

        @NameInMap("Month")
        public String month;

        public static ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport build(java.util.Map<String, ?> map) throws Exception {
            ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport self = new ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport();
            return TeaModel.build(map, self);
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setYear(String year) {
            this.year = year;
            return this;
        }
        public String getYear() {
            return this.year;
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setInboundDurationByMinute(Long inboundDurationByMinute) {
            this.inboundDurationByMinute = inboundDurationByMinute;
            return this;
        }
        public Long getInboundDurationByMinute() {
            return this.inboundDurationByMinute;
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setOutboundCount(Long outboundCount) {
            this.outboundCount = outboundCount;
            return this;
        }
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setOutboundDurationByMinute(Long outboundDurationByMinute) {
            this.outboundDurationByMinute = outboundDurationByMinute;
            return this;
        }
        public Long getOutboundDurationByMinute() {
            return this.outboundDurationByMinute;
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setInboundCount(Long inboundCount) {
            this.inboundCount = inboundCount;
            return this;
        }
        public Long getInboundCount() {
            return this.inboundCount;
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

    }

    public static class ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList extends TeaModel {
        @NameInMap("CallMeasureSummaryReport")
        public java.util.List<ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport> callMeasureSummaryReport;

        public static ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList build(java.util.Map<String, ?> map) throws Exception {
            ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList self = new ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList();
            return TeaModel.build(map, self);
        }

        public ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportList setCallMeasureSummaryReport(java.util.List<ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport> callMeasureSummaryReport) {
            this.callMeasureSummaryReport = callMeasureSummaryReport;
            return this;
        }
        public java.util.List<ListCallMeasureSummaryReportsResponseBodyCallMeasureSummaryReportListCallMeasureSummaryReport> getCallMeasureSummaryReport() {
            return this.callMeasureSummaryReport;
        }

    }

}
