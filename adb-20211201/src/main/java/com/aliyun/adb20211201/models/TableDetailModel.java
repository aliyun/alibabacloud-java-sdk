// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TableDetailModel extends TeaModel {
    @NameInMap("Catalog")
    public String catalog;

    @NameInMap("Columns")
    public java.util.List<ColDetailModel> columns;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreatedBySource")
    public String createdBySource;

    @NameInMap("CreatedByUser")
    public String createdByUser;

    @NameInMap("Description")
    public String description;

    @NameInMap("Location")
    public String location;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static TableDetailModel build(java.util.Map<String, ?> map) throws Exception {
        TableDetailModel self = new TableDetailModel();
        return TeaModel.build(map, self);
    }

    public TableDetailModel setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public TableDetailModel setColumns(java.util.List<ColDetailModel> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<ColDetailModel> getColumns() {
        return this.columns;
    }

    public TableDetailModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TableDetailModel setCreatedBySource(String createdBySource) {
        this.createdBySource = createdBySource;
        return this;
    }
    public String getCreatedBySource() {
        return this.createdBySource;
    }

    public TableDetailModel setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
        return this;
    }
    public String getCreatedByUser() {
        return this.createdByUser;
    }

    public TableDetailModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TableDetailModel setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public TableDetailModel setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public TableDetailModel setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public TableDetailModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public TableDetailModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public TableDetailModel setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public TableDetailModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
