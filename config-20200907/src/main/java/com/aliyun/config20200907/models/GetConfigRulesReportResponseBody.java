// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRulesReportResponseBody extends TeaModel {
    @NameInMap("ConfigRulesReport")
    public GetConfigRulesReportResponseBodyConfigRulesReport configRulesReport;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigRulesReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRulesReportResponseBody self = new GetConfigRulesReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRulesReportResponseBody setConfigRulesReport(GetConfigRulesReportResponseBodyConfigRulesReport configRulesReport) {
        this.configRulesReport = configRulesReport;
        return this;
    }
    public GetConfigRulesReportResponseBodyConfigRulesReport getConfigRulesReport() {
        return this.configRulesReport;
    }

    public GetConfigRulesReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigRulesReportResponseBodyConfigRulesReport extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ReportCreateTimestamp")
        public Long reportCreateTimestamp;

        @NameInMap("ReportStatus")
        public String reportStatus;

        @NameInMap("ReportUrl")
        public String reportUrl;

        public static GetConfigRulesReportResponseBodyConfigRulesReport build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRulesReportResponseBodyConfigRulesReport self = new GetConfigRulesReportResponseBodyConfigRulesReport();
            return TeaModel.build(map, self);
        }

        public GetConfigRulesReportResponseBodyConfigRulesReport setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetConfigRulesReportResponseBodyConfigRulesReport setReportCreateTimestamp(Long reportCreateTimestamp) {
            this.reportCreateTimestamp = reportCreateTimestamp;
            return this;
        }
        public Long getReportCreateTimestamp() {
            return this.reportCreateTimestamp;
        }

        public GetConfigRulesReportResponseBodyConfigRulesReport setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public GetConfigRulesReportResponseBodyConfigRulesReport setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

    }

}
