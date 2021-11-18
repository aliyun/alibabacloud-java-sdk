// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetCallMeasureSummaryReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("NumberReports")
    public GetCallMeasureSummaryReportResponseBodyNumberReports numberReports;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SummaryReport")
    public GetCallMeasureSummaryReportResponseBodySummaryReport summaryReport;

    public static GetCallMeasureSummaryReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallMeasureSummaryReportResponseBody self = new GetCallMeasureSummaryReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallMeasureSummaryReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallMeasureSummaryReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCallMeasureSummaryReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallMeasureSummaryReportResponseBody setNumberReports(GetCallMeasureSummaryReportResponseBodyNumberReports numberReports) {
        this.numberReports = numberReports;
        return this;
    }
    public GetCallMeasureSummaryReportResponseBodyNumberReports getNumberReports() {
        return this.numberReports;
    }

    public GetCallMeasureSummaryReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallMeasureSummaryReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCallMeasureSummaryReportResponseBody setSummaryReport(GetCallMeasureSummaryReportResponseBodySummaryReport summaryReport) {
        this.summaryReport = summaryReport;
        return this;
    }
    public GetCallMeasureSummaryReportResponseBodySummaryReport getSummaryReport() {
        return this.summaryReport;
    }

    public static class GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("InboundCount")
        public Long inboundCount;

        @NameInMap("InboundDurationByMinute")
        public Long inboundDurationByMinute;

        @NameInMap("Month")
        public Integer month;

        @NameInMap("Number")
        public String number;

        @NameInMap("OutboundCount")
        public Long outboundCount;

        @NameInMap("OutboundDurationByMinute")
        public Long outboundDurationByMinute;

        @NameInMap("Year")
        public Integer year;

        public static GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport build(java.util.Map<String, ?> map) throws Exception {
            GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport self = new GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport();
            return TeaModel.build(map, self);
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setInboundCount(Long inboundCount) {
            this.inboundCount = inboundCount;
            return this;
        }
        public Long getInboundCount() {
            return this.inboundCount;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setInboundDurationByMinute(Long inboundDurationByMinute) {
            this.inboundDurationByMinute = inboundDurationByMinute;
            return this;
        }
        public Long getInboundDurationByMinute() {
            return this.inboundDurationByMinute;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setOutboundCount(Long outboundCount) {
            this.outboundCount = outboundCount;
            return this;
        }
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setOutboundDurationByMinute(Long outboundDurationByMinute) {
            this.outboundDurationByMinute = outboundDurationByMinute;
            return this;
        }
        public Long getOutboundDurationByMinute() {
            return this.outboundDurationByMinute;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class GetCallMeasureSummaryReportResponseBodyNumberReportsList extends TeaModel {
        @NameInMap("NumberReport")
        public java.util.List<GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport> numberReport;

        public static GetCallMeasureSummaryReportResponseBodyNumberReportsList build(java.util.Map<String, ?> map) throws Exception {
            GetCallMeasureSummaryReportResponseBodyNumberReportsList self = new GetCallMeasureSummaryReportResponseBodyNumberReportsList();
            return TeaModel.build(map, self);
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReportsList setNumberReport(java.util.List<GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport> numberReport) {
            this.numberReport = numberReport;
            return this;
        }
        public java.util.List<GetCallMeasureSummaryReportResponseBodyNumberReportsListNumberReport> getNumberReport() {
            return this.numberReport;
        }

    }

    public static class GetCallMeasureSummaryReportResponseBodyNumberReports extends TeaModel {
        @NameInMap("List")
        public GetCallMeasureSummaryReportResponseBodyNumberReportsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetCallMeasureSummaryReportResponseBodyNumberReports build(java.util.Map<String, ?> map) throws Exception {
            GetCallMeasureSummaryReportResponseBodyNumberReports self = new GetCallMeasureSummaryReportResponseBodyNumberReports();
            return TeaModel.build(map, self);
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReports setList(GetCallMeasureSummaryReportResponseBodyNumberReportsList list) {
            this.list = list;
            return this;
        }
        public GetCallMeasureSummaryReportResponseBodyNumberReportsList getList() {
            return this.list;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReports setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReports setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetCallMeasureSummaryReportResponseBodyNumberReports setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCallMeasureSummaryReportResponseBodySummaryReport extends TeaModel {
        @NameInMap("Day")
        public Integer day;

        @NameInMap("InboundCount")
        public Long inboundCount;

        @NameInMap("InboundDurationByMinute")
        public Long inboundDurationByMinute;

        @NameInMap("Month")
        public Integer month;

        @NameInMap("OutboundCount")
        public Long outboundCount;

        @NameInMap("OutboundDurationByMinute")
        public Long outboundDurationByMinute;

        @NameInMap("Year")
        public Integer year;

        public static GetCallMeasureSummaryReportResponseBodySummaryReport build(java.util.Map<String, ?> map) throws Exception {
            GetCallMeasureSummaryReportResponseBodySummaryReport self = new GetCallMeasureSummaryReportResponseBodySummaryReport();
            return TeaModel.build(map, self);
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setInboundCount(Long inboundCount) {
            this.inboundCount = inboundCount;
            return this;
        }
        public Long getInboundCount() {
            return this.inboundCount;
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setInboundDurationByMinute(Long inboundDurationByMinute) {
            this.inboundDurationByMinute = inboundDurationByMinute;
            return this;
        }
        public Long getInboundDurationByMinute() {
            return this.inboundDurationByMinute;
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setOutboundCount(Long outboundCount) {
            this.outboundCount = outboundCount;
            return this;
        }
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setOutboundDurationByMinute(Long outboundDurationByMinute) {
            this.outboundDurationByMinute = outboundDurationByMinute;
            return this;
        }
        public Long getOutboundDurationByMinute() {
            return this.outboundDurationByMinute;
        }

        public GetCallMeasureSummaryReportResponseBodySummaryReport setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

}
