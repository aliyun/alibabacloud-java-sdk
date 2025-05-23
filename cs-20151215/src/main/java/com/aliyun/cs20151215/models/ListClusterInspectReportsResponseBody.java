// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterInspectReportsResponseBody extends TeaModel {
    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>405b99e5411f9a4e7148506e45</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of inspection reports.</p>
     */
    @NameInMap("reports")
    public java.util.List<ListClusterInspectReportsResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49511F2D-D56A-5C24-B9AE-C8491E09B***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListClusterInspectReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInspectReportsResponseBody self = new ListClusterInspectReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterInspectReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterInspectReportsResponseBody setReports(java.util.List<ListClusterInspectReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<ListClusterInspectReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public ListClusterInspectReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterInspectReportsResponseBodyReportsSummary extends TeaModel {
        /**
         * <p>The number of items whose result is advice.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("adviceCount")
        public Integer adviceCount;

        /**
         * <p>Aggregated inspection task result code.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The number of items whose result is error.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("errorCount")
        public Integer errorCount;

        /**
         * <p>The number of items whose result is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("normalCount")
        public Integer normalCount;

        /**
         * <p>The number of items whose result is warning.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("warnCount")
        public Integer warnCount;

        public static ListClusterInspectReportsResponseBodyReportsSummary build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInspectReportsResponseBodyReportsSummary self = new ListClusterInspectReportsResponseBodyReportsSummary();
            return TeaModel.build(map, self);
        }

        public ListClusterInspectReportsResponseBodyReportsSummary setAdviceCount(Integer adviceCount) {
            this.adviceCount = adviceCount;
            return this;
        }
        public Integer getAdviceCount() {
            return this.adviceCount;
        }

        public ListClusterInspectReportsResponseBodyReportsSummary setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListClusterInspectReportsResponseBodyReportsSummary setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public ListClusterInspectReportsResponseBodyReportsSummary setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public ListClusterInspectReportsResponseBodyReportsSummary setWarnCount(Integer warnCount) {
            this.warnCount = warnCount;
            return this;
        }
        public Integer getWarnCount() {
            return this.warnCount;
        }

    }

    public static class ListClusterInspectReportsResponseBodyReports extends TeaModel {
        /**
         * <p>The report completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-18T19:40:16.778333+08:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>An inspection report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>782df89346054a0000562063a6****</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <p>The report start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-18T19:40:16.778333+08:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The inspection report status.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The inspection summary.</p>
         */
        @NameInMap("summary")
        public ListClusterInspectReportsResponseBodyReportsSummary summary;

        public static ListClusterInspectReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInspectReportsResponseBodyReports self = new ListClusterInspectReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public ListClusterInspectReportsResponseBodyReports setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListClusterInspectReportsResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListClusterInspectReportsResponseBodyReports setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListClusterInspectReportsResponseBodyReports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterInspectReportsResponseBodyReports setSummary(ListClusterInspectReportsResponseBodyReportsSummary summary) {
            this.summary = summary;
            return this;
        }
        public ListClusterInspectReportsResponseBodyReportsSummary getSummary() {
            return this.summary;
        }

    }

}
