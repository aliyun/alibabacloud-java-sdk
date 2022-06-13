// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableExtended extends TeaModel {
    // Cascade
    @NameInMap("Cascade")
    public Boolean cascade;

    // CreateTime
    @NameInMap("CreateTime")
    public Integer createTime;

    // CreatedBy
    @NameInMap("CreatedBy")
    public String createdBy;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // LastAccessTime
    @NameInMap("LastAccessTime")
    public Integer lastAccessTime;

    // LastAnalyzedTime
    @NameInMap("LastAnalyzedTime")
    public Integer lastAnalyzedTime;

    // Owner
    @NameInMap("Owner")
    public String owner;

    // OwnerType
    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("PartitionKeys")
    public java.util.List<FieldSchema> partitionKeys;

    // privileges
    @NameInMap("Privileges")
    public TableExtendedPrivileges privileges;

    // Retention
    @NameInMap("Retention")
    public Integer retention;

    // RewriteEnabled
    @NameInMap("RewriteEnabled")
    public Boolean rewriteEnabled;

    // sd
    @NameInMap("Sd")
    public TableExtendedSd sd;

    // TableFormat
    @NameInMap("TableFormat")
    public String tableFormat;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    // TableType
    @NameInMap("TableType")
    public String tableType;

    // Temporary
    @NameInMap("Temporary")
    public Boolean temporary;

    // UpdateTime
    @NameInMap("UpdateTime")
    public Integer updateTime;

    // ViewExpandedText
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    // ViewOriginalText
    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    public static TableExtended build(java.util.Map<String, ?> map) throws Exception {
        TableExtended self = new TableExtended();
        return TeaModel.build(map, self);
    }

    public TableExtended setCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }
    public Boolean getCascade() {
        return this.cascade;
    }

    public TableExtended setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public TableExtended setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public TableExtended setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TableExtended setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    public TableExtended setLastAnalyzedTime(Integer lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    public TableExtended setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public TableExtended setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public TableExtended setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public TableExtended setPartitionKeys(java.util.List<FieldSchema> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<FieldSchema> getPartitionKeys() {
        return this.partitionKeys;
    }

    public TableExtended setPrivileges(TableExtendedPrivileges privileges) {
        this.privileges = privileges;
        return this;
    }
    public TableExtendedPrivileges getPrivileges() {
        return this.privileges;
    }

    public TableExtended setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public TableExtended setRewriteEnabled(Boolean rewriteEnabled) {
        this.rewriteEnabled = rewriteEnabled;
        return this;
    }
    public Boolean getRewriteEnabled() {
        return this.rewriteEnabled;
    }

    public TableExtended setSd(TableExtendedSd sd) {
        this.sd = sd;
        return this;
    }
    public TableExtendedSd getSd() {
        return this.sd;
    }

    public TableExtended setTableFormat(String tableFormat) {
        this.tableFormat = tableFormat;
        return this;
    }
    public String getTableFormat() {
        return this.tableFormat;
    }

    public TableExtended setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public TableExtended setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public TableExtended setTemporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }
    public Boolean getTemporary() {
        return this.temporary;
    }

    public TableExtended setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public TableExtended setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public TableExtended setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    public static class TableExtendedPrivileges extends TeaModel {
        // rolePrivileges
        @NameInMap("RolePrivileges")
        public java.util.Map<String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> rolePrivileges;

        // userPrivileges
        @NameInMap("UserPrivileges")
        public java.util.Map<String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> userPrivileges;

        // groupPrivileges
        @NameInMap("groupPrivileges")
        public java.util.Map<String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> groupPrivileges;

        public static TableExtendedPrivileges build(java.util.Map<String, ?> map) throws Exception {
            TableExtendedPrivileges self = new TableExtendedPrivileges();
            return TeaModel.build(map, self);
        }

        public TableExtendedPrivileges setRolePrivileges(java.util.Map<String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> rolePrivileges) {
            this.rolePrivileges = rolePrivileges;
            return this;
        }
        public java.util.Map<String, java.util.List<TableExtendedPrivilegesRolePrivilegesValue>> getRolePrivileges() {
            return this.rolePrivileges;
        }

        public TableExtendedPrivileges setUserPrivileges(java.util.Map<String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> userPrivileges) {
            this.userPrivileges = userPrivileges;
            return this;
        }
        public java.util.Map<String, java.util.List<TableExtendedPrivilegesUserPrivilegesValue>> getUserPrivileges() {
            return this.userPrivileges;
        }

        public TableExtendedPrivileges setGroupPrivileges(java.util.Map<String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> groupPrivileges) {
            this.groupPrivileges = groupPrivileges;
            return this;
        }
        public java.util.Map<String, java.util.List<TableExtendedPrivilegesGroupPrivilegesValue>> getGroupPrivileges() {
            return this.groupPrivileges;
        }

    }

    public static class TableExtendedSdSerDeInfo extends TeaModel {
        // Name
        @NameInMap("Name")
        public String name;

        // Parameters
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerializationLib
        @NameInMap("SerializationLib")
        public String serializationLib;

        public static TableExtendedSdSerDeInfo build(java.util.Map<String, ?> map) throws Exception {
            TableExtendedSdSerDeInfo self = new TableExtendedSdSerDeInfo();
            return TeaModel.build(map, self);
        }

        public TableExtendedSdSerDeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TableExtendedSdSerDeInfo setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public TableExtendedSdSerDeInfo setSerializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }
        public String getSerializationLib() {
            return this.serializationLib;
        }

    }

    public static class TableExtendedSdSkewedInfo extends TeaModel {
        // SkewedColNames
        @NameInMap("SkewedColNames")
        public java.util.List<String> skewedColNames;

        // SkewedColValueLocationMaps
        @NameInMap("SkewedColValueLocationMaps")
        public java.util.Map<String, String> skewedColValueLocationMaps;

        // SkewedColValues
        @NameInMap("SkewedColValues")
        public java.util.List<java.util.List<String>> skewedColValues;

        public static TableExtendedSdSkewedInfo build(java.util.Map<String, ?> map) throws Exception {
            TableExtendedSdSkewedInfo self = new TableExtendedSdSkewedInfo();
            return TeaModel.build(map, self);
        }

        public TableExtendedSdSkewedInfo setSkewedColNames(java.util.List<String> skewedColNames) {
            this.skewedColNames = skewedColNames;
            return this;
        }
        public java.util.List<String> getSkewedColNames() {
            return this.skewedColNames;
        }

        public TableExtendedSdSkewedInfo setSkewedColValueLocationMaps(java.util.Map<String, String> skewedColValueLocationMaps) {
            this.skewedColValueLocationMaps = skewedColValueLocationMaps;
            return this;
        }
        public java.util.Map<String, String> getSkewedColValueLocationMaps() {
            return this.skewedColValueLocationMaps;
        }

        public TableExtendedSdSkewedInfo setSkewedColValues(java.util.List<java.util.List<String>> skewedColValues) {
            this.skewedColValues = skewedColValues;
            return this;
        }
        public java.util.List<java.util.List<String>> getSkewedColValues() {
            return this.skewedColValues;
        }

    }

    public static class TableExtendedSd extends TeaModel {
        // bucketCols
        @NameInMap("BucketCols")
        public java.util.List<String> bucketCols;

        // Cols
        @NameInMap("Cols")
        public java.util.List<FieldSchema> cols;

        // Compressed
        @NameInMap("Compressed")
        public Boolean compressed;

        // InputFormat
        @NameInMap("InputFormat")
        public String inputFormat;

        // Location
        @NameInMap("Location")
        public String location;

        // NumBuckets
        @NameInMap("NumBuckets")
        public Integer numBuckets;

        // OutputFormat
        @NameInMap("OutputFormat")
        public String outputFormat;

        // Parameters
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        // SerDeInfo
        @NameInMap("SerDeInfo")
        public TableExtendedSdSerDeInfo serDeInfo;

        // SkewedInfo
        @NameInMap("SkewedInfo")
        public TableExtendedSdSkewedInfo skewedInfo;

        // SortCols
        @NameInMap("SortCols")
        public java.util.List<Order> sortCols;

        // StoredAsSubDirectories
        @NameInMap("StoredAsSubDirectories")
        public Boolean storedAsSubDirectories;

        public static TableExtendedSd build(java.util.Map<String, ?> map) throws Exception {
            TableExtendedSd self = new TableExtendedSd();
            return TeaModel.build(map, self);
        }

        public TableExtendedSd setBucketCols(java.util.List<String> bucketCols) {
            this.bucketCols = bucketCols;
            return this;
        }
        public java.util.List<String> getBucketCols() {
            return this.bucketCols;
        }

        public TableExtendedSd setCols(java.util.List<FieldSchema> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<FieldSchema> getCols() {
            return this.cols;
        }

        public TableExtendedSd setCompressed(Boolean compressed) {
            this.compressed = compressed;
            return this;
        }
        public Boolean getCompressed() {
            return this.compressed;
        }

        public TableExtendedSd setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public TableExtendedSd setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TableExtendedSd setNumBuckets(Integer numBuckets) {
            this.numBuckets = numBuckets;
            return this;
        }
        public Integer getNumBuckets() {
            return this.numBuckets;
        }

        public TableExtendedSd setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public TableExtendedSd setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public TableExtendedSd setSerDeInfo(TableExtendedSdSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public TableExtendedSdSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

        public TableExtendedSd setSkewedInfo(TableExtendedSdSkewedInfo skewedInfo) {
            this.skewedInfo = skewedInfo;
            return this;
        }
        public TableExtendedSdSkewedInfo getSkewedInfo() {
            return this.skewedInfo;
        }

        public TableExtendedSd setSortCols(java.util.List<Order> sortCols) {
            this.sortCols = sortCols;
            return this;
        }
        public java.util.List<Order> getSortCols() {
            return this.sortCols;
        }

        public TableExtendedSd setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }
        public Boolean getStoredAsSubDirectories() {
            return this.storedAsSubDirectories;
        }

    }

}
