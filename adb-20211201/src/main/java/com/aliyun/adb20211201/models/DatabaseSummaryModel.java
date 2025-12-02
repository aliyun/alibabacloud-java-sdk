// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DatabaseSummaryModel extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreatedBySource")
    public String createdBySource;

    @NameInMap("CreatedByUser")
    public String createdByUser;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Location")
    public String location;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static DatabaseSummaryModel build(java.util.Map<String, ?> map) throws Exception {
        DatabaseSummaryModel self = new DatabaseSummaryModel();
        return TeaModel.build(map, self);
    }

    public DatabaseSummaryModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DatabaseSummaryModel setCreatedBySource(String createdBySource) {
        this.createdBySource = createdBySource;
        return this;
    }
    public String getCreatedBySource() {
        return this.createdBySource;
    }

    public DatabaseSummaryModel setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
        return this;
    }
    public String getCreatedByUser() {
        return this.createdByUser;
    }

    public DatabaseSummaryModel setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DatabaseSummaryModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatabaseSummaryModel setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DatabaseSummaryModel setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DatabaseSummaryModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DatabaseSummaryModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
