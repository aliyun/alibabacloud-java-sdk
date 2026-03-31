// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateReportTemplateShrinkRequest extends TeaModel {
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
    public String reportScopeShrink;

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

    public static UpdateReportTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportTemplateShrinkRequest self = new UpdateReportTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReportTemplateShrinkRequest setReportFileFormats(String reportFileFormats) {
        this.reportFileFormats = reportFileFormats;
        return this;
    }
    public String getReportFileFormats() {
        return this.reportFileFormats;
    }

    public UpdateReportTemplateShrinkRequest setReportGranularity(String reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    public String getReportGranularity() {
        return this.reportGranularity;
    }

    public UpdateReportTemplateShrinkRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public UpdateReportTemplateShrinkRequest setReportScopeShrink(String reportScopeShrink) {
        this.reportScopeShrink = reportScopeShrink;
        return this;
    }
    public String getReportScopeShrink() {
        return this.reportScopeShrink;
    }

    public UpdateReportTemplateShrinkRequest setReportTemplateDescription(String reportTemplateDescription) {
        this.reportTemplateDescription = reportTemplateDescription;
        return this;
    }
    public String getReportTemplateDescription() {
        return this.reportTemplateDescription;
    }

    public UpdateReportTemplateShrinkRequest setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public UpdateReportTemplateShrinkRequest setReportTemplateName(String reportTemplateName) {
        this.reportTemplateName = reportTemplateName;
        return this;
    }
    public String getReportTemplateName() {
        return this.reportTemplateName;
    }

    public UpdateReportTemplateShrinkRequest setSubscriptionFrequency(String subscriptionFrequency) {
        this.subscriptionFrequency = subscriptionFrequency;
        return this;
    }
    public String getSubscriptionFrequency() {
        return this.subscriptionFrequency;
    }

}
