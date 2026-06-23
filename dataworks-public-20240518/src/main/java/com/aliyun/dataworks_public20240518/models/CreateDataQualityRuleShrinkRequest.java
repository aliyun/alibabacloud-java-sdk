// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleShrinkRequest extends TeaModel {
    /**
     * <p>The sample check settings.</p>
     */
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    /**
     * <p>The description of the rule. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the data quality rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of issue handlers for the data quality rule check.</p>
     */
    @NameInMap("ErrorHandlers")
    public String errorHandlersShrink;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The table cannot be empty.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10726</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings required for sample collection.</p>
     */
    @NameInMap("SamplingConfig")
    public String samplingConfigShrink;

    /**
     * <p>The severity of the rule for the business (corresponding to the strong/weak rule on the page). Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>High</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The object monitored by the rule.</p>
     */
    @NameInMap("Target")
    public String targetShrink;

    /**
     * <p>The unique identifier of the rule template that the rule references.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM:table:table_count:fixed</p>
     */
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
