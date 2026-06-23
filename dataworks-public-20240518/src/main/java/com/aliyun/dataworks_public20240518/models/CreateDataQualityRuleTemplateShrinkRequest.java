// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The sample validation settings.</p>
     */
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    /**
     * <p>The category directory where the custom template is stored. Hierarchy levels are separated by slashes. Each level name can be up to 1024 characters long and cannot contain whitespace characters or slashes.</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/order_data</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the rule template. It can be a combination of digits, English letters, Chinese characters, and half-width or full-width punctuation marks. The maximum length is 512 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Table row Count Verification</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings required for sample collection.</p>
     */
    @NameInMap("SamplingConfig")
    public String samplingConfigShrink;

    /**
     * <p>The visibility scope of the template:</p>
     * <ul>
     * <li>Tenant: available to the entire tenant</li>
     * <li>Project: available only in the current project</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("VisibleScope")
    public String visibleScope;

    public static CreateDataQualityRuleTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityRuleTemplateShrinkRequest self = new CreateDataQualityRuleTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityRuleTemplateShrinkRequest setCheckingConfigShrink(String checkingConfigShrink) {
        this.checkingConfigShrink = checkingConfigShrink;
        return this;
    }
    public String getCheckingConfigShrink() {
        return this.checkingConfigShrink;
    }

    public CreateDataQualityRuleTemplateShrinkRequest setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public CreateDataQualityRuleTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityRuleTemplateShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityRuleTemplateShrinkRequest setSamplingConfigShrink(String samplingConfigShrink) {
        this.samplingConfigShrink = samplingConfigShrink;
        return this;
    }
    public String getSamplingConfigShrink() {
        return this.samplingConfigShrink;
    }

    public CreateDataQualityRuleTemplateShrinkRequest setVisibleScope(String visibleScope) {
        this.visibleScope = visibleScope;
        return this;
    }
    public String getVisibleScope() {
        return this.visibleScope;
    }

}
