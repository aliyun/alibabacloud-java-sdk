// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleShrinkRequest extends TeaModel {
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
    @NameInMap("Id")
    public Long id;

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

    public static UpdateDataQualityRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityRuleShrinkRequest self = new UpdateDataQualityRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityRuleShrinkRequest setCheckingConfigShrink(String checkingConfigShrink) {
        this.checkingConfigShrink = checkingConfigShrink;
        return this;
    }
    public String getCheckingConfigShrink() {
        return this.checkingConfigShrink;
    }

    public UpdateDataQualityRuleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityRuleShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateDataQualityRuleShrinkRequest setErrorHandlersShrink(String errorHandlersShrink) {
        this.errorHandlersShrink = errorHandlersShrink;
        return this;
    }
    public String getErrorHandlersShrink() {
        return this.errorHandlersShrink;
    }

    public UpdateDataQualityRuleShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityRuleShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityRuleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityRuleShrinkRequest setSamplingConfigShrink(String samplingConfigShrink) {
        this.samplingConfigShrink = samplingConfigShrink;
        return this;
    }
    public String getSamplingConfigShrink() {
        return this.samplingConfigShrink;
    }

    public UpdateDataQualityRuleShrinkRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public UpdateDataQualityRuleShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

    public UpdateDataQualityRuleShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
