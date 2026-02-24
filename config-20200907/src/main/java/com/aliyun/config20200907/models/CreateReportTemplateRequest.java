// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateReportTemplateRequest extends TeaModel {
    /**
     * <p>Report format. Currently, only Excel is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("ReportFileFormats")
    public String reportFileFormats;

    /**
     * <p>Report aggregation granularity.</p>
     * <p>Supported for management accounts:</p>
     * <ul>
     * <li><p>AllInOne (All accounts within the template scope are aggregated into one report)</p>
     * </li>
     * <li><p>GroupByAggregator (Reports are aggregated by account group, generating a compressed file)</p>
     * </li>
     * <li><p>GroupByAccount (Each account generates a separate report (default), generating a compressed file)</p>
     * </li>
     * </ul>
     * <p>Member accounts only support GroupByAccount.</p>
     * 
     * <strong>example:</strong>
     * <p>GroupByAccount</p>
     */
    @NameInMap("ReportGranularity")
    public String reportGranularity;

    /**
     * <p>Report language. Supports zh-CN and en-US. If empty, the default is en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    /**
     * <p>An array of report scopes, used to select the range of rules included in the audit report. The logic between each ReportScope in the array is OR, which means additive logic.</p>
     * <blockquote>
     * <p>For example, if the array size is 2, the first ReportScope specifies rule In cr-1, and the second ReportScope specifies rule In cr-2, then the rule scope defined by this report is cr-1 and cr-2.</p>
     * </blockquote>
     */
    @NameInMap("ReportScope")
    public java.util.List<CreateReportTemplateRequestReportScope> reportScope;

    /**
     * <p>Report template description</p>
     * 
     * <strong>example:</strong>
     * <p>test-report-description</p>
     */
    @NameInMap("ReportTemplateDescription")
    public String reportTemplateDescription;

    /**
     * <p>Report template name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-report-name</p>
     */
    @NameInMap("ReportTemplateName")
    public String reportTemplateName;

    /**
     * <p>Report subscription frequency. If this field is not empty, it is a Quartz-format Cron expression that triggers subscription notifications.</p>
     * <p>Format: second minute hour day month week. The following are common Cron expression examples:</p>
     * <ul>
     * <li><p>Execute at 0:00 every day: 0 0 0 \* \* ?</p>
     * </li>
     * <li><p>Execute at 15:30 every Monday: 0 30 15 ? \* MON</p>
     * </li>
     * <li><p>Execute at 2:00 on the 1st of every month: 0 0 2 1 \* ?</p>
     * </li>
     * </ul>
     * <p>Where:</p>
     * <ul>
     * <li><p>&quot;\*&quot; indicates any value</p>
     * </li>
     * <li><p>&quot;?&quot; is used for day and week fields, indicating no specific value</p>
     * </li>
     * <li><p>&quot;MON&quot; indicates Monday</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The trigger time is UTC+8. Adjust the Cron expression settings based on your time zone.</p>
     * </blockquote>
     * <blockquote>
     * <p>We try to trigger notifications according to the Cron expression time, but there might be delays due to report generation status. A Cron expression limits the same template to trigger notifications at most once per day.</p>
     * </blockquote>
     * <blockquote>
     * <p>1 represents Sunday; 2 represents Monday; 3 represents Tuesday; 4 represents Wednesday; 5 represents Thursday; 6 represents Friday; 7 represents Saturday</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0 0 9 * * ?</p>
     */
    @NameInMap("SubscriptionFrequency")
    public String subscriptionFrequency;

    public static CreateReportTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportTemplateRequest self = new CreateReportTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportTemplateRequest setReportFileFormats(String reportFileFormats) {
        this.reportFileFormats = reportFileFormats;
        return this;
    }
    public String getReportFileFormats() {
        return this.reportFileFormats;
    }

    public CreateReportTemplateRequest setReportGranularity(String reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    public String getReportGranularity() {
        return this.reportGranularity;
    }

    public CreateReportTemplateRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public CreateReportTemplateRequest setReportScope(java.util.List<CreateReportTemplateRequestReportScope> reportScope) {
        this.reportScope = reportScope;
        return this;
    }
    public java.util.List<CreateReportTemplateRequestReportScope> getReportScope() {
        return this.reportScope;
    }

    public CreateReportTemplateRequest setReportTemplateDescription(String reportTemplateDescription) {
        this.reportTemplateDescription = reportTemplateDescription;
        return this;
    }
    public String getReportTemplateDescription() {
        return this.reportTemplateDescription;
    }

    public CreateReportTemplateRequest setReportTemplateName(String reportTemplateName) {
        this.reportTemplateName = reportTemplateName;
        return this;
    }
    public String getReportTemplateName() {
        return this.reportTemplateName;
    }

    public CreateReportTemplateRequest setSubscriptionFrequency(String subscriptionFrequency) {
        this.subscriptionFrequency = subscriptionFrequency;
        return this;
    }
    public String getSubscriptionFrequency() {
        return this.subscriptionFrequency;
    }

    public static class CreateReportTemplateRequestReportScope extends TeaModel {
        /**
         * <p>The key for the report scope. Currently supports:</p>
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
         * <p>Matching logic. Currently, only In is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>In</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value for the report scope. Multiple items of the same type, such as multiple Rule IDs, can be separated by English commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cr-1,cr-2</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateReportTemplateRequestReportScope build(java.util.Map<String, ?> map) throws Exception {
            CreateReportTemplateRequestReportScope self = new CreateReportTemplateRequestReportScope();
            return TeaModel.build(map, self);
        }

        public CreateReportTemplateRequestReportScope setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateReportTemplateRequestReportScope setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateReportTemplateRequestReportScope setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
