// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("NewOwnerId")
    public String newOwnerId;

    @NameInMap("AddedLabels")
    public String addedLabels;

    @NameInMap("RemovedLabels")
    public String removedLabels;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Visibility")
    public Integer visibility;

    @NameInMap("Caption")
    public String caption;

    public static UpdateMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableRequest self = new UpdateMetaTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateMetaTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public UpdateMetaTableRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public UpdateMetaTableRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public UpdateMetaTableRequest setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
        return this;
    }
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    public UpdateMetaTableRequest setAddedLabels(String addedLabels) {
        this.addedLabels = addedLabels;
        return this;
    }
    public String getAddedLabels() {
        return this.addedLabels;
    }

    public UpdateMetaTableRequest setRemovedLabels(String removedLabels) {
        this.removedLabels = removedLabels;
        return this;
    }
    public String getRemovedLabels() {
        return this.removedLabels;
    }

    public UpdateMetaTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateMetaTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

    public UpdateMetaTableRequest setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

}
