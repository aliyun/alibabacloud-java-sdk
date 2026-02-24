// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateReportTemplateRequest extends TeaModel {
    /**
     * <p>The format of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("ReportFileFormats")
    public String reportFileFormats;

    /**
     * <p>The aggregation granularity of the report.</p>
     * <p>For a management account, the following values are supported:</p>
     * <ul>
     * <li><p>AllInOne: A single report is generated for all accounts within the template scope.</p>
     * </li>
     * <li><p>GroupByAggregator: Reports are aggregated by account group. A compressed file is generated.</p>
     * </li>
     * <li><p>GroupByAccount: A separate report is generated for each account. This is the default value. A compressed file is generated.</p>
     * </li>
     * </ul>
     * <p>For a member account, only GroupByAccount is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AllInOne</p>
     */
    @NameInMap("ReportGranularity")
    public String reportGranularity;

    /**
     * <p>The language of the report. Valid values: zh-CN and en-US. If you leave this parameter empty, the default value en-US is used.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    /**
     * <p>An array that specifies the report scope. It is used to select the range of rules to include in the audit report. The logical relationship between multiple ReportScope objects in the array is OR. This means the scopes are added together.</p>
     * <blockquote>
     * <p>For example, if the array contains two ReportScope objects, where the first specifies the rule In cr-1 and the second specifies the rule In cr-2, the report scope includes both cr-1 and cr-2.</p>
     * </blockquote>
     */
    @NameInMap("ReportScope")
    public java.util.List<UpdateReportTemplateRequestReportScope> reportScope;

    /**
     * <p>The description of the report template.</p>
     * 
     * <strong>example:</strong>
     * <p>test-description</p>
     */
    @NameInMap("ReportTemplateDescription")
    public String reportTemplateDescription;

    /**
     * <p>The ID of the report template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crt-xxx</p>
     */
    @NameInMap("ReportTemplateId")
    public String reportTemplateId;

    /**
     * <p>The name of the report template.</p>
     * 
     * <strong>example:</strong>
     * <p>test-name</p>
     */
    @NameInMap("ReportTemplateName")
    public String reportTemplateName;

    /**
     * <p>The frequency for subscribing to the report. If this parameter is not empty, it specifies a cron expression in the Quartz format that triggers a subscription notification.</p>
     * <p>The format is: Second Minute Hour Day Month Week. The following list provides common examples of cron expressions:</p>
     * <ul>
     * <li><p>To run at 00:00 every day: 0 0 0 \* \* ?</p>
     * </li>
     * <li><p>To run at 15:30 every Monday: 0 30 15 ? \* MON</p>
     * </li>
     * <li><p>To run at 02:00 on the first day of every month: 0 0 2 1 \* ?</p>
     * </li>
     * </ul>
     * <p>Where:</p>
     * <ul>
     * <li><p>&quot;\*&quot; indicates any value.</p>
     * </li>
     * <li><p>? is used in the Day and Week fields and indicates that no specific value is specified.</p>
     * </li>
     * <li><p>MON indicates Monday.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The trigger time is in UTC+8. You can convert the cron expression based on your time zone.</p>
     * </blockquote>
     * <blockquote>
     * <p>The system attempts to trigger the notification at the time specified by the cron expression. However, a delay may occur due to the report generation status. The cron expression limits the notification for the same template to a maximum of once per day.</p>
     * </blockquote>
     * <blockquote>
     * <p>In addition to using MON for Monday, you can also use numbers. In the Quartz framework, 1 represents Sunday, 2 represents Monday, 3 represents Tuesday, 4 represents Wednesday, 5 represents Thursday, 6 represents Friday, and 7 represents Saturday.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0 0 0 * * ?</p>
     */
    @NameInMap("SubscriptionFrequency")
    public String subscriptionFrequency;

    public static UpdateReportTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportTemplateRequest self = new UpdateReportTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReportTemplateRequest setReportFileFormats(String reportFileFormats) {
        this.reportFileFormats = reportFileFormats;
        return this;
    }
    public String getReportFileFormats() {
        return this.reportFileFormats;
    }

    public UpdateReportTemplateRequest setReportGranularity(String reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    public String getReportGranularity() {
        return this.reportGranularity;
    }

    public UpdateReportTemplateRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public UpdateReportTemplateRequest setReportScope(java.util.List<UpdateReportTemplateRequestReportScope> reportScope) {
        this.reportScope = reportScope;
        return this;
    }
    public java.util.List<UpdateReportTemplateRequestReportScope> getReportScope() {
        return this.reportScope;
    }

    public UpdateReportTemplateRequest setReportTemplateDescription(String reportTemplateDescription) {
        this.reportTemplateDescription = reportTemplateDescription;
        return this;
    }
    public String getReportTemplateDescription() {
        return this.reportTemplateDescription;
    }

    public UpdateReportTemplateRequest setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public UpdateReportTemplateRequest setReportTemplateName(String reportTemplateName) {
        this.reportTemplateName = reportTemplateName;
        return this;
    }
    public String getReportTemplateName() {
        return this.reportTemplateName;
    }

    public UpdateReportTemplateRequest setSubscriptionFrequency(String subscriptionFrequency) {
        this.subscriptionFrequency = subscriptionFrequency;
        return this;
    }
    public String getSubscriptionFrequency() {
        return this.subscriptionFrequency;
    }

    public static class UpdateReportTemplateRequestReportScope extends TeaModel {
        /**
         * <p>The key of the report scope. Supported values:</p>
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
         * <p>The matching logic. Only In is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>In</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value of the report scope. To specify multiple items of the same type, such as multiple rule IDs, separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cr-1,cr-2</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateReportTemplateRequestReportScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateReportTemplateRequestReportScope self = new UpdateReportTemplateRequestReportScope();
            return TeaModel.build(map, self);
        }

        public UpdateReportTemplateRequestReportScope setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateReportTemplateRequestReportScope setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateReportTemplateRequestReportScope setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
