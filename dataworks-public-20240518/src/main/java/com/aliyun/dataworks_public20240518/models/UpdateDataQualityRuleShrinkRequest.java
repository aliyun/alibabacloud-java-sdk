// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleShrinkRequest extends TeaModel {
    /**
     * <p>The check settings for sample data.</p>
     */
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    /**
     * <p>The description of the rule. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The operations that you can perform after the rule-based check fails.</p>
     */
    @NameInMap("ErrorHandlers")
    public String errorHandlersShrink;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the rule. The name can be up to 255 characters in length and can contain digits, letters, and punctuation marks.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sampling settings.</p>
     */
    @NameInMap("SamplingConfig")
    public String samplingConfigShrink;

    /**
     * <p>The strength of the rule. Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>High</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The monitored object of the rule.</p>
     */
    @NameInMap("Target")
    public String targetShrink;

    /**
     * <p>The ID of the template used by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>system::user_defined</p>
     */
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
