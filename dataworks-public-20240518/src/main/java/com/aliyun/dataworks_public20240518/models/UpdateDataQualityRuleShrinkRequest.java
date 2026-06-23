// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleShrinkRequest extends TeaModel {
    /**
     * <p>The sample verification settings.</p>
     */
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    /**
     * <p>The rule description. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the rule is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of issue handlers for data quality rule verification.</p>
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
     * <p>The rule name. The name can be a combination of digits, English letters, Chinese characters, and half-width or full-width punctuation. The maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>The table cannot be empty.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings required for sample collection.</p>
     */
    @NameInMap("SamplingConfig")
    public String samplingConfigShrink;

    /**
     * <p>The severity level of the rule for the business (corresponding to strong/weak rules on the page). Valid values:</p>
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
     * <p>The unique identifier of the rule template referenced by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM:table:table_count:fixed</p>
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

    public UpdateDataQualityRuleShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
