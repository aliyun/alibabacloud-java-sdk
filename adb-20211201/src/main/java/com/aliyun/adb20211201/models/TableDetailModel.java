// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TableDetailModel extends TeaModel {
    /**
     * <p>External data source.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Column information.</p>
     */
    @NameInMap("Columns")
    public java.util.List<ColDetailModel> columns;

    /**
     * <p>Creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05 13:17:55</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreatedBySource")
    public String createdBySource;

    @NameInMap("CreatedByUser")
    public String createdByUser;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Location")
    public String location;

    /**
     * <p>Owner.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>Logical database name.</p>
     * 
     * <strong>example:</strong>
     * <p>schemaName</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>Logical table name.</p>
     * 
     * <strong>example:</strong>
     * <p>tableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>Table type.</p>
     * 
     * <strong>example:</strong>
     * <p>PHYSICAL_SCHEMA_NAME</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>Update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05 13:17:55</p>
     */
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
