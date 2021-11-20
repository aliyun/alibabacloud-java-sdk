// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackReportResponseBody extends TeaModel {
    @NameInMap("CompliancePackReport")
    public GetCompliancePackReportResponseBodyCompliancePackReport compliancePackReport;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCompliancePackReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackReportResponseBody self = new GetCompliancePackReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackReportResponseBody setCompliancePackReport(GetCompliancePackReportResponseBodyCompliancePackReport compliancePackReport) {
        this.compliancePackReport = compliancePackReport;
        return this;
    }
    public GetCompliancePackReportResponseBodyCompliancePackReport getCompliancePackReport() {
        return this.compliancePackReport;
    }

    public GetCompliancePackReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCompliancePackReportResponseBodyCompliancePackReport extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        @NameInMap("ReportStatus")
        public String reportStatus;

        @NameInMap("ReportUrl")
        public String reportUrl;

        public static GetCompliancePackReportResponseBodyCompliancePackReport build(java.util.Map<String, ?> map) throws Exception {
            GetCompliancePackReportResponseBodyCompliancePackReport self = new GetCompliancePackReportResponseBodyCompliancePackReport();
            return TeaModel.build(map, self);
        }

        public GetCompliancePackReportResponseBodyCompliancePackReport setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetCompliancePackReportResponseBodyCompliancePackReport setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetCompliancePackReportResponseBodyCompliancePackReport setReportCreateTimestamp(Long reportCreateTimestamp) {
            this.reportCreateTimestamp = reportCreateTimestamp;
            return this;
        }
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
        }

        public GetCompliancePackReportResponseBodyCompliancePackReport setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public GetCompliancePackReportResponseBodyCompliancePackReport setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

    }

}
