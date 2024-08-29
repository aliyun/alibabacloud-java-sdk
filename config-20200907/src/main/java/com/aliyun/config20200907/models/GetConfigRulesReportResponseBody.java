// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRulesReportResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation report.</p>
     */
    @NameInMap("ConfigRulesReport")
    public GetConfigRulesReportResponseBodyConfigRulesReport configRulesReport;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account to which the rules belong.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The timestamp when the compliance evaluation report was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
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
         * <li>COMPLETE: The compliance evaluation report is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The URL that is used to download the compliance evaluation report.</p>
         */
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

        public GetConfigRulesReportResponseBodyConfigRulesReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
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
