// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetReportTemplateResponseBody extends TeaModel {
    /**
     * <p>Report template.</p>
     */
    @NameInMap("ReportTemplate")
    public GetReportTemplateResponseBodyReportTemplate reportTemplate;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7A0FFF8-0B44-40C6-8BBF-3A185EFDF3F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetReportTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateResponseBody self = new GetReportTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateResponseBody setReportTemplate(GetReportTemplateResponseBodyReportTemplate reportTemplate) {
        this.reportTemplate = reportTemplate;
        return this;
    }
    public GetReportTemplateResponseBodyReportTemplate getReportTemplate() {
        return this.reportTemplate;
    }

    public GetReportTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetReportTemplateResponseBodyReportTemplateReportScope extends TeaModel {
        /**
         * <p>Key for the report scope. Supported keys:</p>
         * <ul>
         * <li><p>AggregatorId</p>
         * </li>
         * <li><p>CompliancePackId</p>
         * </li>
         * <li><p>RuleId</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RuleId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Matching logic. Only In is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>In</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>Value for the report scope. For multiple values of the same type, such as multiple rule IDs, separate them with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-1,cr-2</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetReportTemplateResponseBodyReportTemplateReportScope build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateResponseBodyReportTemplateReportScope self = new GetReportTemplateResponseBodyReportTemplateReportScope();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateResponseBodyReportTemplateReportScope setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetReportTemplateResponseBodyReportTemplateReportScope setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetReportTemplateResponseBodyReportTemplateReportScope setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetReportTemplateResponseBodyReportTemplate extends TeaModel {
        /**
         * <p>Report file format.</p>
         * 
         * <strong>example:</strong>
         * <p>excel</p>
         */
        @NameInMap("ReportFileFormats")
        public String reportFileFormats;

        /**
         * <p>Aggregation granularity of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>AllInOne</p>
         */
        @NameInMap("ReportGranularity")
        public String reportGranularity;

        /**
         * <p>Report language. Valid values: zh-CN and en-US. Default is en-US if empty.</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <p>Array of report scopes. Each scope defines a set of rules included in the audit report. Scopes use OR logic. That is, rules from all scopes are combined.</p>
         * <blockquote>
         * <p>If the array has two items, and the first specifies RuleId cr-1 while the second specifies RuleId cr-2, then the report covers both cr-1 and cr-2.</p>
         * </blockquote>
         */
        @NameInMap("ReportScope")
        public java.util.List<GetReportTemplateResponseBodyReportTemplateReportScope> reportScope;

        /**
         * <p>Description of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>test-description</p>
         */
        @NameInMap("ReportTemplateDescription")
        public String reportTemplateDescription;

        /**
         * <p>ID of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        @NameInMap("ReportTemplateId")
        public String reportTemplateId;

        /**
         * <p>Name of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ReportTemplateName")
        public String reportTemplateName;

        /**
         * <p>Subscription frequency for the report. If this field is not empty, it contains a Quartz-formatted cron expression that triggers notifications.</p>
         * <p>The format is: seconds minutes hours day-of-month month day-of-week. Common examples include the following:</p>
         * <ul>
         * <li><p>Run daily at 00:00: 0 0 0 \* \* ?</p>
         * </li>
         * <li><p>Run every Monday at 15:30: 0 30 15 ? \* MON</p>
         * </li>
         * <li><p>Run on the first day of each month at 02:00: 0 0 2 1 \* ?</p>
         * </li>
         * </ul>
         * <p>Where:</p>
         * <ul>
         * <li><p>&quot;\*&quot; means any value.</p>
         * </li>
         * <li><p>&quot;?&quot; means no specific value for the day-of-month or day-of-week field.</p>
         * </li>
         * <li><p>MON means Monday.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Trigger times are in UTC+8. Adjust your cron expression based on your time zone.</p>
         * </blockquote>
         * <blockquote>
         * <p>The system tries to trigger notifications as close as possible to the scheduled time. Delays may occur due to report generation status. A single template can trigger at most one notification per day.</p>
         * </blockquote>
         * <blockquote>
         * <p>In Quartz, days of the week are numbered: 1 = Sunday, 2 = Monday, 3 = Tuesday, 4 = Wednesday, 5 = Thursday, 6 = Friday, 7 = Saturday.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("SubscriptionFrequency")
        public String subscriptionFrequency;

        public static GetReportTemplateResponseBodyReportTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateResponseBodyReportTemplate self = new GetReportTemplateResponseBodyReportTemplate();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateResponseBodyReportTemplate setReportFileFormats(String reportFileFormats) {
            this.reportFileFormats = reportFileFormats;
            return this;
        }
        public String getReportFileFormats() {
            return this.reportFileFormats;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportGranularity(String reportGranularity) {
            this.reportGranularity = reportGranularity;
            return this;
        }
        public String getReportGranularity() {
            return this.reportGranularity;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportScope(java.util.List<GetReportTemplateResponseBodyReportTemplateReportScope> reportScope) {
            this.reportScope = reportScope;
            return this;
        }
        public java.util.List<GetReportTemplateResponseBodyReportTemplateReportScope> getReportScope() {
            return this.reportScope;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportTemplateDescription(String reportTemplateDescription) {
            this.reportTemplateDescription = reportTemplateDescription;
            return this;
        }
        public String getReportTemplateDescription() {
            return this.reportTemplateDescription;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportTemplateId(String reportTemplateId) {
            this.reportTemplateId = reportTemplateId;
            return this;
        }
        public String getReportTemplateId() {
            return this.reportTemplateId;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportTemplateName(String reportTemplateName) {
            this.reportTemplateName = reportTemplateName;
            return this;
        }
        public String getReportTemplateName() {
            return this.reportTemplateName;
        }

        public GetReportTemplateResponseBodyReportTemplate setSubscriptionFrequency(String subscriptionFrequency) {
            this.subscriptionFrequency = subscriptionFrequency;
            return this;
        }
        public String getSubscriptionFrequency() {
            return this.subscriptionFrequency;
        }

    }

}
