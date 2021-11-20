// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRulesReportResponseBody extends TeaModel {
    @NameInMap("ConfigRulesReport")
    public GetAggregateConfigRulesReportResponseBodyConfigRulesReport configRulesReport;

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
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        @NameInMap("ReportStatus")
        public String reportStatus;

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
