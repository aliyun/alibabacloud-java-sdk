// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The settings for sample validation.</p>
     */
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    /**
     * <p>The code of the rule template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:123</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The category directory in which the custom template is stored. Levels are separated by forward slashes (/). The name of each level can be up to 1024 characters in length and cannot contain whitespace characters or forward slashes (/).</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/order_data</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the rule template. The name can contain digits, letters, Chinese characters, and half-width and full-width punctuation marks. The name can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Table row Count Verification</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace used for this API call.</p>
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

    public static UpdateDataQualityRuleTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityRuleTemplateShrinkRequest self = new UpdateDataQualityRuleTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityRuleTemplateShrinkRequest setCheckingConfigShrink(String checkingConfigShrink) {
        this.checkingConfigShrink = checkingConfigShrink;
        return this;
    }
    public String getCheckingConfigShrink() {
        return this.checkingConfigShrink;
    }

    public UpdateDataQualityRuleTemplateShrinkRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDataQualityRuleTemplateShrinkRequest setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public UpdateDataQualityRuleTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityRuleTemplateShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityRuleTemplateShrinkRequest setSamplingConfigShrink(String samplingConfigShrink) {
        this.samplingConfigShrink = samplingConfigShrink;
        return this;
    }
    public String getSamplingConfigShrink() {
        return this.samplingConfigShrink;
    }

}
