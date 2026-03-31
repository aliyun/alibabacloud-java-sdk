// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateReportTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("ReportFileFormats")
    public String reportFileFormats;

    /**
     * <strong>example:</strong>
     * <p>ReportGranularity</p>
     */
    @NameInMap("ReportGranularity")
    public String reportGranularity;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ReportLanguage")
    public String reportLanguage;

    @NameInMap("ReportScope")
    public java.util.List<CreateReportTemplateRequestReportScope> reportScope;

    /**
     * <strong>example:</strong>
     * <p>test-report-description</p>
     */
    @NameInMap("ReportTemplateDescription")
    public String reportTemplateDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-report-name</p>
     */
    @NameInMap("ReportTemplateName")
    public String reportTemplateName;

    /**
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
         * <strong>example:</strong>
         * <p>RuleId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>In</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
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
