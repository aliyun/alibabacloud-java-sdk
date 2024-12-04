// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The check settings for sample data.</p>
     */
    @NameInMap("CheckingConfig")
    public String checkingConfigShrink;

    /**
     * <p>The code for the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:123</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The directory in which the template is stored. Slashes (/) are used to separate directory levels. The name of each directory level can be up to 1,024 characters in length. It cannot contain whitespace characters or slashes (/).</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the template. The name can be up to 512 characters in length and can contain digits, letters, and punctuation marks.</p>
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
