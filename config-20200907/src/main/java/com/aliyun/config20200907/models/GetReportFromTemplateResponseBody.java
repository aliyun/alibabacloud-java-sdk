// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetReportFromTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE9FFFE5-FCAD-4B24-9546-BF49273C562B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The report generated from the template.</p>
     */
    @NameInMap("TemplateReport")
    public GetReportFromTemplateResponseBodyTemplateReport templateReport;

    public static GetReportFromTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportFromTemplateResponseBody self = new GetReportFromTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportFromTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReportFromTemplateResponseBody setTemplateReport(GetReportFromTemplateResponseBodyTemplateReport templateReport) {
        this.templateReport = templateReport;
        return this;
    }
    public GetReportFromTemplateResponseBodyTemplateReport getTemplateReport() {
        return this.templateReport;
    }

    public static class GetReportFromTemplateResponseBodyTemplateReport extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1478085326082xxx</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The timestamp when the report was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1763540426815</p>
         */
        @NameInMap("ReportCreateEndTimestamp")
        public Long reportCreateEndTimestamp;

        /**
         * <p>The timestamp when the report started to be generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1763540421815</p>
         */
        @NameInMap("ReportCreateStartTimestamp")
        public Long reportCreateStartTimestamp;

        /**
         * <p>The ID of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        @NameInMap("ReportTemplateId")
        public String reportTemplateId;

        /**
         * <p>The download URL of the report.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("ReportUrl")
        public String reportUrl;

        /**
         * <p>The status of the report. Valid values:</p>
         * <ul>
         * <li><p>COMPLETE: The report is generated.</p>
         * </li>
         * <li><p>CREATING: The report is being generated.</p>
         * </li>
         * <li><p>FAILED: The report failed to be generated.</p>
         * </li>
         * <li><p>TIMEOUT: The request timed out.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the report generated from the template.</p>
         * 
         * <strong>example:</strong>
         * <p>crtr-xxx</p>
         */
        @NameInMap("TemplateReportId")
        public String templateReportId;

        public static GetReportFromTemplateResponseBodyTemplateReport build(java.util.Map<String, ?> map) throws Exception {
            GetReportFromTemplateResponseBodyTemplateReport self = new GetReportFromTemplateResponseBodyTemplateReport();
            return TeaModel.build(map, self);
        }

        public GetReportFromTemplateResponseBodyTemplateReport setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetReportFromTemplateResponseBodyTemplateReport setReportCreateEndTimestamp(Long reportCreateEndTimestamp) {
            this.reportCreateEndTimestamp = reportCreateEndTimestamp;
            return this;
        }
        public Long getReportCreateEndTimestamp() {
            return this.reportCreateEndTimestamp;
        }

        public GetReportFromTemplateResponseBodyTemplateReport setReportCreateStartTimestamp(Long reportCreateStartTimestamp) {
            this.reportCreateStartTimestamp = reportCreateStartTimestamp;
            return this;
        }
        public Long getReportCreateStartTimestamp() {
            return this.reportCreateStartTimestamp;
        }

        public GetReportFromTemplateResponseBodyTemplateReport setReportTemplateId(String reportTemplateId) {
            this.reportTemplateId = reportTemplateId;
            return this;
        }
        public String getReportTemplateId() {
            return this.reportTemplateId;
        }

        public GetReportFromTemplateResponseBodyTemplateReport setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

        public GetReportFromTemplateResponseBodyTemplateReport setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetReportFromTemplateResponseBodyTemplateReport setTemplateReportId(String templateReportId) {
            this.templateReportId = templateReportId;
            return this;
        }
        public String getTemplateReportId() {
            return this.templateReportId;
        }

    }

}
