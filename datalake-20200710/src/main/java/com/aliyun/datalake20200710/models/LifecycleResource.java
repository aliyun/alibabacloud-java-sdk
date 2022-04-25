// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class LifecycleResource extends TeaModel {
    // BizId
    @NameInMap("BizId")
    public String bizId;

    // Database
    @NameInMap("Database")
    public LifecycleResourceDatabase database;

    // 数据库名称
    @NameInMap("DatabaseName")
    public String databaseName;

    // DatabaseProfile
    @NameInMap("DatabaseProfile")
    public DatabaseProfile databaseProfile;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 生命周期规则id
    @NameInMap("LifecycleRuleBizId")
    public String lifecycleRuleBizId;

    // Owner
    @NameInMap("Owner")
    public Long owner;

    // Table
    @NameInMap("Table")
    public LifecycleResourceTable table;

    // 表名称
    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableProfile")
    public TableProfile tableProfile;

    public static LifecycleResource build(java.util.Map<String, ?> map) throws Exception {
        LifecycleResource self = new LifecycleResource();
        return TeaModel.build(map, self);
    }

    public LifecycleResource setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public LifecycleResource setDatabase(LifecycleResourceDatabase database) {
        this.database = database;
        return this;
    }
    public LifecycleResourceDatabase getDatabase() {
        return this.database;
    }

    public LifecycleResource setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public LifecycleResource setDatabaseProfile(DatabaseProfile databaseProfile) {
        this.databaseProfile = databaseProfile;
        return this;
    }
    public DatabaseProfile getDatabaseProfile() {
        return this.databaseProfile;
    }

    public LifecycleResource setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public LifecycleResource setLifecycleRuleBizId(String lifecycleRuleBizId) {
        this.lifecycleRuleBizId = lifecycleRuleBizId;
        return this;
    }
    public String getLifecycleRuleBizId() {
        return this.lifecycleRuleBizId;
    }

    public LifecycleResource setOwner(Long owner) {
        this.owner = owner;
        return this;
    }
    public Long getOwner() {
        return this.owner;
    }

    public LifecycleResource setTable(LifecycleResourceTable table) {
        this.table = table;
        return this;
    }
    public LifecycleResourceTable getTable() {
        return this.table;
    }

    public LifecycleResource setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public LifecycleResource setTableProfile(TableProfile tableProfile) {
        this.tableProfile = tableProfile;
        return this;
    }
    public TableProfile getTableProfile() {
        return this.tableProfile;
    }

    public static class LifecycleResourceDatabase extends TeaModel {
        // CreateTime
        @NameInMap("CreateTime")
        public Long createTime;

        // Description
        @NameInMap("Description")
        public String description;

        // LocationUri
        @NameInMap("LocationUri")
        public String locationUri;

        // Name
        @NameInMap("Name")
        public String name;

        // UpdateTime
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static LifecycleResourceDatabase build(java.util.Map<String, ?> map) throws Exception {
            LifecycleResourceDatabase self = new LifecycleResourceDatabase();
            return TeaModel.build(map, self);
        }

        public LifecycleResourceDatabase setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public LifecycleResourceDatabase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public LifecycleResourceDatabase setLocationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }
        public String getLocationUri() {
            return this.locationUri;
        }

        public LifecycleResourceDatabase setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LifecycleResourceDatabase setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class LifecycleResourceTableSdSerDeInfo extends TeaModel {
        // Name
        @NameInMap("Name")
        public String name;

        // Parameters
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static LifecycleResourceTableSdSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            LifecycleResourceTableSdSerDeInfo self = new LifecycleResourceTableSdSerDeInfo();
            return TeaModel.build(map, self);
        }

        public LifecycleResourceTableSdSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LifecycleResourceTableSdSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public LifecycleResourceTableSdSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class LifecycleResourceTableSd extends TeaModel {
        // BucketCols
        @NameInMap("BucketCols")
        public java.util.List<String> bucketCols;

        // InputFormat
        @NameInMap("InputFormat")
        public String inputFormat;

        // Location
        @NameInMap("Location")
        public String location;

        // OutputFormat
        @NameInMap("OutputFormat")
        public String outputFormat;

        // Parameters
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDeInfo
        @NameInMap("SerDeInfo")
        public LifecycleResourceTableSdSerDeInfo serDeInfo;

        public static LifecycleResourceTableSd build(java.util.Map<String, ?> map) throws Exception {
            LifecycleResourceTableSd self = new LifecycleResourceTableSd();
            return TeaModel.build(map, self);
        }

        public LifecycleResourceTableSd setBucketCols(java.util.List<String> bucketCols) {
            this.bucketCols = bucketCols;
            return this;
        }
        public java.util.List<String> getBucketCols() {
            return this.bucketCols;
        }

        public LifecycleResourceTableSd setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public LifecycleResourceTableSd setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public LifecycleResourceTableSd setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public LifecycleResourceTableSd setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public LifecycleResourceTableSd setSerDeInfo(LifecycleResourceTableSdSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public LifecycleResourceTableSdSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

    }

    public static class LifecycleResourceTable extends TeaModel {
        // CreateTime
        @NameInMap("CreateTime")
        public Long createTime;

        // DatabaseName
        @NameInMap("DatabaseName")
        public String databaseName;

        // Parameters
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // Sd
        @NameInMap("Sd")
        public LifecycleResourceTableSd sd;

        // TableName
        @NameInMap("TableName")
        public String tableName;

        // TableType
        @NameInMap("TableType")
        public String tableType;

        public static LifecycleResourceTable build(java.util.Map<String, ?> map) throws Exception {
            LifecycleResourceTable self = new LifecycleResourceTable();
            return TeaModel.build(map, self);
        }

        public LifecycleResourceTable setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public LifecycleResourceTable setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public LifecycleResourceTable setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public LifecycleResourceTable setSd(LifecycleResourceTableSd sd) {
            this.sd = sd;
            return this;
        }
        public LifecycleResourceTableSd getSd() {
            return this.sd;
        }

        public LifecycleResourceTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public LifecycleResourceTable setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

}
