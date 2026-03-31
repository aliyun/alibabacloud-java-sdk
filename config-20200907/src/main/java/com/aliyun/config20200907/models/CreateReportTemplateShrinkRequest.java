// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateReportTemplateShrinkRequest extends TeaModel {
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
    public String reportScopeShrink;

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

    public static CreateReportTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportTemplateShrinkRequest self = new CreateReportTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportTemplateShrinkRequest setReportFileFormats(String reportFileFormats) {
        this.reportFileFormats = reportFileFormats;
        return this;
    }
    public String getReportFileFormats() {
        return this.reportFileFormats;
    }

    public CreateReportTemplateShrinkRequest setReportGranularity(String reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    public String getReportGranularity() {
        return this.reportGranularity;
    }

    public CreateReportTemplateShrinkRequest setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
        return this;
    }
    public String getReportLanguage() {
        return this.reportLanguage;
    }

    public CreateReportTemplateShrinkRequest setReportScopeShrink(String reportScopeShrink) {
        this.reportScopeShrink = reportScopeShrink;
        return this;
    }
    public String getReportScopeShrink() {
        return this.reportScopeShrink;
    }

    public CreateReportTemplateShrinkRequest setReportTemplateDescription(String reportTemplateDescription) {
        this.reportTemplateDescription = reportTemplateDescription;
        return this;
    }
    public String getReportTemplateDescription() {
        return this.reportTemplateDescription;
    }

    public CreateReportTemplateShrinkRequest setReportTemplateName(String reportTemplateName) {
        this.reportTemplateName = reportTemplateName;
        return this;
    }
    public String getReportTemplateName() {
        return this.reportTemplateName;
    }

    public CreateReportTemplateShrinkRequest setSubscriptionFrequency(String subscriptionFrequency) {
        this.subscriptionFrequency = subscriptionFrequency;
        return this;
    }
    public String getSubscriptionFrequency() {
        return this.subscriptionFrequency;
    }

}
