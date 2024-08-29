// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackReportResponseBody extends TeaModel {
    /**
     * <p>The compliance evaluation report that is generated based on a compliance package.</p>
     */
    @NameInMap("CompliancePackReport")
    public GetAggregateCompliancePackReportResponseBodyCompliancePackReport compliancePackReport;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0D234DAC-1ABD-42E8-9475-BE317857E29B</p>
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
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624330246640</p>
         */
        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        /**
         * <p>The status of the compliance evaluation report. Valid values:</p>
         * <ul>
         * <li>NONE: The compliance evaluation report is not generated.</li>
         * <li>CREATING: The compliance evaluation report is being generated.</li>
         * <li>COMPLETE: The compliance evaluation report is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
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
