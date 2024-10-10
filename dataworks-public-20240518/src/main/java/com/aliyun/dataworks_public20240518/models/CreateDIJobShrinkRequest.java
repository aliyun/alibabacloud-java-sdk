// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationDataSourceSettings")
    public String destinationDataSourceSettingsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_to_holo_sync_8772</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobSettings")
    public String jobSettingsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSettings")
    public String resourceSettingsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDataSourceSettings")
    public String sourceDataSourceSettingsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>This parameter is required.</p>
     */
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
