// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TableModel extends TeaModel {
    @NameInMap("ArchiveType")
    public String archiveType;

    @NameInMap("BlockSize")
    public Long blockSize;

    @NameInMap("Bucket")
    public Long bucket;

    @NameInMap("BucketCount")
    public Long bucketCount;

    @NameInMap("Cols")
    public java.util.List<FieldSchemaModel> cols;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("Compression")
    public String compression;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CurrentVersion")
    public Long currentVersion;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DictEncode")
    public Boolean dictEncode;

    @NameInMap("DistributeColumns")
    public java.util.List<FieldSchemaModel> distributeColumns;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("EnableDfs")
    public Boolean enableDfs;

    @NameInMap("HotPartitionCount")
    public Long hotPartitionCount;

    @NameInMap("Indexes")
    public java.util.List<CstoreIndexModel> indexes;

    @NameInMap("IsAllIndex")
    public Boolean isAllIndex;

    @NameInMap("IsFulltextDict")
    public Boolean isFulltextDict;

    @NameInMap("MaxColumnId")
    public Long maxColumnId;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("PartitionColumn")
    public String partitionColumn;

    @NameInMap("PartitionCount")
    public Long partitionCount;

    @NameInMap("PartitionKeys")
    public java.util.List<FieldSchemaModel> partitionKeys;

    @NameInMap("PartitionType")
    public String partitionType;

    @NameInMap("PhysicalDatabaseName")
    public String physicalDatabaseName;

    @NameInMap("PhysicalTableName")
    public String physicalTableName;

    @NameInMap("PreviousVersion")
    public Long previousVersion;

    @NameInMap("RawTableName")
    public String rawTableName;

    @NameInMap("RouteColumns")
    public java.util.List<FieldSchemaModel> routeColumns;

    @NameInMap("RouteEffectiveColumn")
    public FieldSchemaModel routeEffectiveColumn;

    @NameInMap("RouteType")
    public String routeType;

    @NameInMap("RtEngineType")
    public String rtEngineType;

    @NameInMap("RtIndexAll")
    public Boolean rtIndexAll;

    @NameInMap("RtModeType")
    public String rtModeType;

    @NameInMap("Sd")
    public StorageDescriptorModel sd;

    @NameInMap("StoragePolicy")
    public String storagePolicy;

    @NameInMap("SubpartitionColumn")
    public String subpartitionColumn;

    @NameInMap("SubpartitionCount")
    public Long subpartitionCount;

    @NameInMap("SubpartitionType")
    public String subpartitionType;

    @NameInMap("TableEngineName")
    public String tableEngineName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TableType")
    public String tableType;

    @NameInMap("TblId")
    public Long tblId;

    @NameInMap("Temporary")
    public Boolean temporary;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    @NameInMap("ViewSecurityMode")
    public String viewSecurityMode;

    public static TableModel build(java.util.Map<String, ?> map) throws Exception {
        TableModel self = new TableModel();
        return TeaModel.build(map, self);
    }

    public TableModel setArchiveType(String archiveType) {
        this.archiveType = archiveType;
        return this;
    }
    public String getArchiveType() {
        return this.archiveType;
    }

    public TableModel setBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    public Long getBlockSize() {
        return this.blockSize;
    }

    public TableModel setBucket(Long bucket) {
        this.bucket = bucket;
        return this;
    }
    public Long getBucket() {
        return this.bucket;
    }

    public TableModel setBucketCount(Long bucketCount) {
        this.bucketCount = bucketCount;
        return this;
    }
    public Long getBucketCount() {
        return this.bucketCount;
    }

    public TableModel setCols(java.util.List<FieldSchemaModel> cols) {
        this.cols = cols;
        return this;
    }
    public java.util.List<FieldSchemaModel> getCols() {
        return this.cols;
    }

    public TableModel setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public TableModel setCompression(String compression) {
        this.compression = compression;
        return this;
    }
    public String getCompression() {
        return this.compression;
    }

    public TableModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TableModel setCurrentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public TableModel setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public TableModel setDictEncode(Boolean dictEncode) {
        this.dictEncode = dictEncode;
        return this;
    }
    public Boolean getDictEncode() {
        return this.dictEncode;
    }

    public TableModel setDistributeColumns(java.util.List<FieldSchemaModel> distributeColumns) {
        this.distributeColumns = distributeColumns;
        return this;
    }
    public java.util.List<FieldSchemaModel> getDistributeColumns() {
        return this.distributeColumns;
    }

    public TableModel setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public TableModel setEnableDfs(Boolean enableDfs) {
        this.enableDfs = enableDfs;
        return this;
    }
    public Boolean getEnableDfs() {
        return this.enableDfs;
    }

    public TableModel setHotPartitionCount(Long hotPartitionCount) {
        this.hotPartitionCount = hotPartitionCount;
        return this;
    }
    public Long getHotPartitionCount() {
        return this.hotPartitionCount;
    }

    public TableModel setIndexes(java.util.List<CstoreIndexModel> indexes) {
        this.indexes = indexes;
        return this;
    }
    public java.util.List<CstoreIndexModel> getIndexes() {
        return this.indexes;
    }

    public TableModel setIsAllIndex(Boolean isAllIndex) {
        this.isAllIndex = isAllIndex;
        return this;
    }
    public Boolean getIsAllIndex() {
        return this.isAllIndex;
    }

    public TableModel setIsFulltextDict(Boolean isFulltextDict) {
        this.isFulltextDict = isFulltextDict;
        return this;
    }
    public Boolean getIsFulltextDict() {
        return this.isFulltextDict;
    }

    public TableModel setMaxColumnId(Long maxColumnId) {
        this.maxColumnId = maxColumnId;
        return this;
    }
    public Long getMaxColumnId() {
        return this.maxColumnId;
    }

    public TableModel setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public TableModel setPartitionColumn(String partitionColumn) {
        this.partitionColumn = partitionColumn;
        return this;
    }
    public String getPartitionColumn() {
        return this.partitionColumn;
    }

    public TableModel setPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    public TableModel setPartitionKeys(java.util.List<FieldSchemaModel> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<FieldSchemaModel> getPartitionKeys() {
        return this.partitionKeys;
    }

    public TableModel setPartitionType(String partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public String getPartitionType() {
        return this.partitionType;
    }

    public TableModel setPhysicalDatabaseName(String physicalDatabaseName) {
        this.physicalDatabaseName = physicalDatabaseName;
        return this;
    }
    public String getPhysicalDatabaseName() {
        return this.physicalDatabaseName;
    }

    public TableModel setPhysicalTableName(String physicalTableName) {
        this.physicalTableName = physicalTableName;
        return this;
    }
    public String getPhysicalTableName() {
        return this.physicalTableName;
    }

    public TableModel setPreviousVersion(Long previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }
    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    public TableModel setRawTableName(String rawTableName) {
        this.rawTableName = rawTableName;
        return this;
    }
    public String getRawTableName() {
        return this.rawTableName;
    }

    public TableModel setRouteColumns(java.util.List<FieldSchemaModel> routeColumns) {
        this.routeColumns = routeColumns;
        return this;
    }
    public java.util.List<FieldSchemaModel> getRouteColumns() {
        return this.routeColumns;
    }

    public TableModel setRouteEffectiveColumn(FieldSchemaModel routeEffectiveColumn) {
        this.routeEffectiveColumn = routeEffectiveColumn;
        return this;
    }
    public FieldSchemaModel getRouteEffectiveColumn() {
        return this.routeEffectiveColumn;
    }

    public TableModel setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public TableModel setRtEngineType(String rtEngineType) {
        this.rtEngineType = rtEngineType;
        return this;
    }
    public String getRtEngineType() {
        return this.rtEngineType;
    }

    public TableModel setRtIndexAll(Boolean rtIndexAll) {
        this.rtIndexAll = rtIndexAll;
        return this;
    }
    public Boolean getRtIndexAll() {
        return this.rtIndexAll;
    }

    public TableModel setRtModeType(String rtModeType) {
        this.rtModeType = rtModeType;
        return this;
    }
    public String getRtModeType() {
        return this.rtModeType;
    }

    public TableModel setSd(StorageDescriptorModel sd) {
        this.sd = sd;
        return this;
    }
    public StorageDescriptorModel getSd() {
        return this.sd;
    }

    public TableModel setStoragePolicy(String storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
    public String getStoragePolicy() {
        return this.storagePolicy;
    }

    public TableModel setSubpartitionColumn(String subpartitionColumn) {
        this.subpartitionColumn = subpartitionColumn;
        return this;
    }
    public String getSubpartitionColumn() {
        return this.subpartitionColumn;
    }

    public TableModel setSubpartitionCount(Long subpartitionCount) {
        this.subpartitionCount = subpartitionCount;
        return this;
    }
    public Long getSubpartitionCount() {
        return this.subpartitionCount;
    }

    public TableModel setSubpartitionType(String subpartitionType) {
        this.subpartitionType = subpartitionType;
        return this;
    }
    public String getSubpartitionType() {
        return this.subpartitionType;
    }

    public TableModel setTableEngineName(String tableEngineName) {
        this.tableEngineName = tableEngineName;
        return this;
    }
    public String getTableEngineName() {
        return this.tableEngineName;
    }

    public TableModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public TableModel setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public TableModel setTblId(Long tblId) {
        this.tblId = tblId;
        return this;
    }
    public Long getTblId() {
        return this.tblId;
    }

    public TableModel setTemporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }
    public Boolean getTemporary() {
        return this.temporary;
    }

    public TableModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public TableModel setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    public TableModel setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    public TableModel setViewSecurityMode(String viewSecurityMode) {
        this.viewSecurityMode = viewSecurityMode;
        return this;
    }
    public String getViewSecurityMode() {
        return this.viewSecurityMode;
    }

}
