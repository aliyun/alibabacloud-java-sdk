// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackReportResponseBody extends TeaModel {
    @NameInMap("CompliancePackReport")
    public GetAggregateCompliancePackReportResponseBodyCompliancePackReport compliancePackReport;

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
