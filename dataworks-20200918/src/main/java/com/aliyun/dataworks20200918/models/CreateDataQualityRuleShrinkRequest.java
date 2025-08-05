// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleShrinkRequest extends TeaModel {
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("ErrorHandlers")
    public String errorHandlersShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SamplingConfig")
    public String samplingConfigShrink;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("Target")
    public String targetShrink;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static CreateDataQualityRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityRuleShrinkRequest self = new CreateDataQualityRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityRuleShrinkRequest setCheckingConfigShrink(String checkingConfigShrink) {
        this.checkingConfigShrink = checkingConfigShrink;
        return this;
    }
    public String getCheckingConfigShrink() {
        return this.checkingConfigShrink;
    }

    public CreateDataQualityRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataQualityRuleShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateDataQualityRuleShrinkRequest setErrorHandlersShrink(String errorHandlersShrink) {
        this.errorHandlersShrink = errorHandlersShrink;
        return this;
    }
    public String getErrorHandlersShrink() {
        return this.errorHandlersShrink;
    }

    public CreateDataQualityRuleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityRuleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityRuleShrinkRequest setSamplingConfigShrink(String samplingConfigShrink) {
        this.samplingConfigShrink = samplingConfigShrink;
        return this;
    }
    public String getSamplingConfigShrink() {
        return this.samplingConfigShrink;
    }

    public CreateDataQualityRuleShrinkRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CreateDataQualityRuleShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

    public CreateDataQualityRuleShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
