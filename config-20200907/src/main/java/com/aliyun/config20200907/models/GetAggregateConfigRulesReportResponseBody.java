// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRulesReportResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation report.</p>
     */
    @NameInMap("ConfigRulesReport")
    public GetAggregateConfigRulesReportResponseBodyConfigRulesReport configRulesReport;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
         */
        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        /**
         * <p>The ID of the compliance evaluation report.</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The status of the compliance evaluation report. Valid values:</p>
         * <br>
         * <p>*   NONE: The compliance evaluation report was not generated.</p>
         * <p>*   CREATING: The compliance evaluation report was being generated.</p>
         * <p>*   COMPLETE: The compliance evaluation report was generated.</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The URL that is used to download the compliance evaluation report.</p>
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
