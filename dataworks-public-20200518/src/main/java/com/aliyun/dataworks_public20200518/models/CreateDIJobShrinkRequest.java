// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDIJobShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DestinationDataSourceSettings")
    public String destinationDataSourceSettingsShrink;

    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobSettings")
    public String jobSettingsShrink;

    @NameInMap("MigrationType")
    public String migrationType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResourceSettings")
    public String resourceSettingsShrink;

    @NameInMap("SourceDataSourceSettings")
    public String sourceDataSourceSettingsShrink;

    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    @NameInMap("SystemDebug")
    public String systemDebug;

    @NameInMap("TableMappings")
    public String tableMappingsShrink;

    @NameInMap("TransformationRules")
    public String transformationRulesShrink;

    public static CreateDIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobShrinkRequest self = new CreateDIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDIJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDIJobShrinkRequest setDestinationDataSourceSettingsShrink(String destinationDataSourceSettingsShrink) {
        this.destinationDataSourceSettingsShrink = destinationDataSourceSettingsShrink;
        return this;
    }
    public String getDestinationDataSourceSettingsShrink() {
        return this.destinationDataSourceSettingsShrink;
    }

    public CreateDIJobShrinkRequest setDestinationDataSourceType(String destinationDataSourceType) {
        this.destinationDataSourceType = destinationDataSourceType;
        return this;
    }
    public String getDestinationDataSourceType() {
        return this.destinationDataSourceType;
    }

    public CreateDIJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateDIJobShrinkRequest setJobSettingsShrink(String jobSettingsShrink) {
        this.jobSettingsShrink = jobSettingsShrink;
        return this;
    }
    public String getJobSettingsShrink() {
        return this.jobSettingsShrink;
    }

    public CreateDIJobShrinkRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public CreateDIJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDIJobShrinkRequest setResourceSettingsShrink(String resourceSettingsShrink) {
        this.resourceSettingsShrink = resourceSettingsShrink;
        return this;
    }
    public String getResourceSettingsShrink() {
        return this.resourceSettingsShrink;
    }

    public CreateDIJobShrinkRequest setSourceDataSourceSettingsShrink(String sourceDataSourceSettingsShrink) {
        this.sourceDataSourceSettingsShrink = sourceDataSourceSettingsShrink;
        return this;
    }
    public String getSourceDataSourceSettingsShrink() {
        return this.sourceDataSourceSettingsShrink;
    }

    public CreateDIJobShrinkRequest setSourceDataSourceType(String sourceDataSourceType) {
        this.sourceDataSourceType = sourceDataSourceType;
        return this;
    }
    public String getSourceDataSourceType() {
        return this.sourceDataSourceType;
    }

    public CreateDIJobShrinkRequest setSystemDebug(String systemDebug) {
        this.systemDebug = systemDebug;
        return this;
    }
    public String getSystemDebug() {
        return this.systemDebug;
    }

    public CreateDIJobShrinkRequest setTableMappingsShrink(String tableMappingsShrink) {
        this.tableMappingsShrink = tableMappingsShrink;
        return this;
    }
    public String getTableMappingsShrink() {
        return this.tableMappingsShrink;
    }

    public CreateDIJobShrinkRequest setTransformationRulesShrink(String transformationRulesShrink) {
        this.transformationRulesShrink = transformationRulesShrink;
        return this;
    }
    public String getTransformationRulesShrink() {
        return this.transformationRulesShrink;
    }

}
