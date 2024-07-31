// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableRequest extends TeaModel {
    /**
     * <p>The names of the labels that you want to add. Separate the labels with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>a,b,c</p>
     */
    @NameInMap("AddedLabels")
    public String addedLabels;

    /**
     * <p>The display name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>The ID of the category that you want to associate.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The environment of the DataWorks workspace. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The new owner ID. If you leave this parameter empty, the owner ID is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("NewOwnerId")
    public String newOwnerId;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The names of labels that you want to remove. Separate the labels with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>a,b,c</p>
     */
    @NameInMap("RemovedLabels")
    public String removedLabels;

    /**
     * <p>The schema information about the table. You must configure this parameter if you enable the three-layer model of MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The GUID of the table. Specify the GUID in the format of odps.{projectName}.{tableName}.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.test.table1</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The scope in which the table is visible. Valid values: 0, 1, and 2. The value 0 indicates that the table is invisible to all members. The value 1 indicates that the table is visible to all members. The value 2 indicates that the table is visible to workspace members.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
