// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIJobShrinkRequest extends TeaModel {
    @NameInMap("DIJobId")
    public Long DIJobId;

    @NameInMap("Description")
    public String description;

    @NameInMap("JobSettings")
    public String jobSettingsShrink;

    @NameInMap("ResourceSettings")
    public String resourceSettingsShrink;

    @NameInMap("TableMappings")
    public String tableMappingsShrink;

    @NameInMap("TransformationRules")
    public String transformationRulesShrink;

    public static UpdateDIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIJobShrinkRequest self = new UpdateDIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDIJobShrinkRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public UpdateDIJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDIJobShrinkRequest setJobSettingsShrink(String jobSettingsShrink) {
        this.jobSettingsShrink = jobSettingsShrink;
        return this;
    }
    public String getJobSettingsShrink() {
        return this.jobSettingsShrink;
    }

    public UpdateDIJobShrinkRequest setResourceSettingsShrink(String resourceSettingsShrink) {
        this.resourceSettingsShrink = resourceSettingsShrink;
        return this;
    }
    public String getResourceSettingsShrink() {
        return this.resourceSettingsShrink;
    }

    public UpdateDIJobShrinkRequest setTableMappingsShrink(String tableMappingsShrink) {
        this.tableMappingsShrink = tableMappingsShrink;
        return this;
    }
    public String getTableMappingsShrink() {
        return this.tableMappingsShrink;
    }

    public UpdateDIJobShrinkRequest setTransformationRulesShrink(String transformationRulesShrink) {
        this.transformationRulesShrink = transformationRulesShrink;
        return this;
    }
    public String getTransformationRulesShrink() {
        return this.transformationRulesShrink;
    }

}
