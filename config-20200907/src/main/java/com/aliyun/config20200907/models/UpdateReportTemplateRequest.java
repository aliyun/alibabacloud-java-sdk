// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateReportTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>excel</p>
     */
    @NameInMap("ReportFileFormats")
    public String reportFileFormats;

    /**
     * <strong>example:</strong>
     * <p>AllInOne</p>
     */
    @NameInMap("ReportGranularity")
    public String reportGranularity;

    @NameInMap("ReportLanguage")
    public String reportLanguage;

    @NameInMap("ReportScope")
    public java.util.List<UpdateReportTemplateRequestReportScope> reportScope;

    /**
     * <strong>example:</strong>
     * <p>test-description</p>
     */
    @NameInMap("ReportTemplateDescription")
    public String reportTemplateDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crt-xxx</p>
     */
    @NameInMap("ReportTemplateId")
    public String reportTemplateId;

    /**
     * <strong>example:</strong>
     * <p>test-name</p>
     */
    @NameInMap("ReportTemplateName")
    public String reportTemplateName;

    /**
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
