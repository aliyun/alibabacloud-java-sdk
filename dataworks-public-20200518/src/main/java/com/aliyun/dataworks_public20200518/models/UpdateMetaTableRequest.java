// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableRequest extends TeaModel {
    /**
     * <p>The names of the labels that you want to add. Separate the labels with commas (,).</p>
     */
    @NameInMap("AddedLabels")
    public String addedLabels;

    /**
     * <p>The display name of the table.</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>The ID of the category that you want to associate.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The environment of the DataWorks workspace. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The ID of the new owner. If this parameter is not specified, the owner ID is not updated.</p>
     */
    @NameInMap("NewOwnerId")
    public String newOwnerId;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The names of labels that you want to delete. Separate the labels with commas (,).</p>
     */
    @NameInMap("RemovedLabels")
    public String removedLabels;

    /**
     * <p>The schema information of the table. You need to configure this parameter if you enable the table schema in MaxCompute.</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The globally unique identifier (GUID) of the table. Specify the GUID in the format of odps.{projectName}.{tableName}.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The scope in which the table is visible. Valid values: 0, 1, and 2. The value 0 indicates that the table is invisible to all workspace members. The value 1 indicates that the table is visible to all workspace members. The value 2 indicates that the table is visible to workspace members.</p>
     */
    @NameInMap("Visibility")
    public Integer visibility;

    public static UpdateMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableRequest self = new UpdateMetaTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableRequest setAddedLabels(String addedLabels) {
        this.addedLabels = addedLabels;
        return this;
    }
    public String getAddedLabels() {
        return this.addedLabels;
    }

    public UpdateMetaTableRequest setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public UpdateMetaTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateMetaTableRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public UpdateMetaTableRequest setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
        return this;
    }
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    public UpdateMetaTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateMetaTableRequest setRemovedLabels(String removedLabels) {
        this.removedLabels = removedLabels;
        return this;
    }
    public String getRemovedLabels() {
        return this.removedLabels;
    }

    public UpdateMetaTableRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public UpdateMetaTableRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public UpdateMetaTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public UpdateMetaTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

}
