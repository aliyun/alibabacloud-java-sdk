// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRulesReportResponseBody extends TeaModel {
    /**
     * <p>The compliance evaluation report.</p>
     */
    @NameInMap("ConfigRulesReport")
    public GetAggregateConfigRulesReportResponseBodyConfigRulesReport configRulesReport;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0BCC7B2-D0E4-49B0-95D2-6689CFB08D31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigRulesReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRulesReportResponseBody self = new GetAggregateConfigRulesReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRulesReportResponseBody setConfigRulesReport(GetAggregateConfigRulesReportResponseBodyConfigRulesReport configRulesReport) {
        this.configRulesReport = configRulesReport;
        return this;
    }
    public GetAggregateConfigRulesReportResponseBodyConfigRulesReport getConfigRulesReport() {
        return this.configRulesReport;
    }

    public GetAggregateConfigRulesReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigRulesReportResponseBodyConfigRulesReport extends TeaModel {
        /**
         * <p>The ID of the management account to which the rules belong.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624332329593</p>
         */
        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        /**
         * <p>The ID of the compliance evaluation report.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-88176457e0d900c9****</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The status of the compliance evaluation report. Valid values:</p>
         * <ul>
         * <li>NONE: The compliance evaluation report is not generated.</li>
         * <li>CREATING: The compliance evaluation report is being generated.</li>
         * <li>COMPLETE: The compliance evaluation report was generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The URL used to download the compliance evaluation report.</p>
         */
        @NameInMap("ReportUrl")
        public String reportUrl;

        public static GetAggregateConfigRulesReportResponseBodyConfigRulesReport build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRulesReportResponseBodyConfigRulesReport self = new GetAggregateConfigRulesReportResponseBodyConfigRulesReport();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRulesReportResponseBodyConfigRulesReport setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateConfigRulesReportResponseBodyConfigRulesReport setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregateConfigRulesReportResponseBodyConfigRulesReport setReportCreateTimestamp(Long reportCreateTimestamp) {
            this.reportCreateTimestamp = reportCreateTimestamp;
            return this;
        }
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
        }

        public GetAggregateConfigRulesReportResponseBodyConfigRulesReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetAggregateConfigRulesReportResponseBodyConfigRulesReport setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public GetAggregateConfigRulesReportResponseBodyConfigRulesReport setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

    }

}
