// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackReportResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation report.</p>
     */
    @NameInMap("CompliancePackReport")
    public GetAggregateCompliancePackReportResponseBodyCompliancePackReport compliancePackReport;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateCompliancePackReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackReportResponseBody self = new GetAggregateCompliancePackReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackReportResponseBody setCompliancePackReport(GetAggregateCompliancePackReportResponseBodyCompliancePackReport compliancePackReport) {
        this.compliancePackReport = compliancePackReport;
        return this;
    }
    public GetAggregateCompliancePackReportResponseBodyCompliancePackReport getCompliancePackReport() {
        return this.compliancePackReport;
    }

    public GetAggregateCompliancePackReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateCompliancePackReportResponseBodyCompliancePackReport extends TeaModel {
        /**
         * <p>The ID of the management account to which the compliance package belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
         */
        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        /**
         * <p>The status of the compliance evaluation report. Valid values:</p>
         * <br>
         * <p>*   NONE: The compliance evaluation report is not generated.</p>
         * <p>*   CREATING: The compliance evaluation report is being generated.</p>
         * <p>*   COMPLETED: The compliance evaluation report is generated.</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The URL that is used to download the compliance evaluation report.</p>
         */
        @NameInMap("ReportUrl")
        public String reportUrl;

        public static GetAggregateCompliancePackReportResponseBodyCompliancePackReport build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateCompliancePackReportResponseBodyCompliancePackReport self = new GetAggregateCompliancePackReportResponseBodyCompliancePackReport();
            return TeaModel.build(map, self);
        }

        public GetAggregateCompliancePackReportResponseBodyCompliancePackReport setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateCompliancePackReportResponseBodyCompliancePackReport setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateCompliancePackReportResponseBodyCompliancePackReport setReportCreateTimestamp(Long reportCreateTimestamp) {
            this.reportCreateTimestamp = reportCreateTimestamp;
            return this;
        }
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
        }

        public GetAggregateCompliancePackReportResponseBodyCompliancePackReport setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public GetAggregateCompliancePackReportResponseBodyCompliancePackReport setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

    }

}
