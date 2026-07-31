// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TableModel extends TeaModel {
    /**
     * <p>The archive type.</p>
     * 
     * <strong>example:</strong>
     * <p>ArchiveType</p>
     */
    @NameInMap("ArchiveType")
    public String archiveType;

    /**
     * <p>The block size.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("BlockSize")
    public Long blockSize;

    /**
     * <p>The bucket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Bucket")
    public Long bucket;

    /**
     * <p>The number of buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("BucketCount")
    public Long bucketCount;

    /**
     * <p>The column information.</p>
     */
    @NameInMap("Cols")
    public java.util.List<FieldSchemaModel> cols;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The compression method.</p>
     * 
     * <strong>example:</strong>
     * <p>Compression</p>
     */
    @NameInMap("Compression")
    public String compression;

    /**
     * <p>The time when the table was created.</p>
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
     * <p>The current version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentVersion")
    public Long currentVersion;

    /**
     * <p>The name of the logical database.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Indicates whether the dictionary is encrypted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DictEncode")
    public Boolean dictEncode;

    /**
     * <p>The distribution columns.</p>
     */
    @NameInMap("DistributeColumns")
    public java.util.List<FieldSchemaModel> distributeColumns;

    /**
     * <p>The distribution type.</p>
     * 
     * <strong>example:</strong>
     * <p>DistributeType</p>
     */
    @NameInMap("DistributeType")
    public String distributeType;

    /**
     * <p>Indicates whether DFS is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDfs")
    public Boolean enableDfs;

    /**
     * <p>The number of hot partitions.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("HotPartitionCount")
    public Long hotPartitionCount;

    /**
     * <p>The indexes.</p>
     */
    @NameInMap("Indexes")
    public java.util.List<CstoreIndexModel> indexes;

    /**
     * <p>Indicates whether the index is a full index.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAllIndex")
    public Boolean isAllIndex;

    /**
     * <p>Indicates whether the table is a full-text index dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFulltextDict")
    public Boolean isFulltextDict;

    /**
     * <p>The maximum column ID.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxColumnId</p>
     */
    @NameInMap("MaxColumnId")
    public Long maxColumnId;

    /**
     * <p>The parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <p>The information about the partition key column.</p>
     * 
     * <strong>example:</strong>
     * <p>colName</p>
     */
    @NameInMap("PartitionColumn")
    public String partitionColumn;

    /**
     * <p>The number of partitions.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("PartitionCount")
    public Long partitionCount;

    /**
     * <p>The partition keys.</p>
     */
    @NameInMap("PartitionKeys")
    public java.util.List<FieldSchemaModel> partitionKeys;

    /**
     * <p>The partition type.</p>
     * 
     * <strong>example:</strong>
     * <p>PartitionType</p>
     */
    @NameInMap("PartitionType")
    public String partitionType;

    /**
     * <p>The name of the physical database.</p>
     * 
     * <strong>example:</strong>
     * <p>physicalDatabaseName</p>
     */
    @NameInMap("PhysicalDatabaseName")
    public String physicalDatabaseName;

    /**
     * <p>The name of the physical table.</p>
     * 
     * <strong>example:</strong>
     * <p>physicalTableName</p>
     */
    @NameInMap("PhysicalTableName")
    public String physicalTableName;

    /**
     * <p>The previous version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PreviousVersion")
    public Long previousVersion;

    /**
     * <p>The raw table name.</p>
     * 
     * <strong>example:</strong>
     * <p>RawTableName</p>
     */
    @NameInMap("RawTableName")
    public String rawTableName;

    /**
     * <p>The routing columns.</p>
     */
    @NameInMap("RouteColumns")
    public java.util.List<FieldSchemaModel> routeColumns;

    /**
     * <p>The effective routing column.</p>
     */
    @NameInMap("RouteEffectiveColumn")
    public FieldSchemaModel routeEffectiveColumn;

    /**
     * <p>The routing type.</p>
     * 
     * <strong>example:</strong>
     * <p>routeType</p>
     */
    @NameInMap("RouteType")
    public String routeType;

    /**
     * <p>The routing engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>RtEngineType</p>
     */
    @NameInMap("RtEngineType")
    public String rtEngineType;

    /**
     * <p>Indicates whether to route all indexes.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RtIndexAll")
    public Boolean rtIndexAll;

    /**
     * <p>The routing mode type.</p>
     * 
     * <strong>example:</strong>
     * <p>RtModeType</p>
     */
    @NameInMap("RtModeType")
    public String rtModeType;

    /**
     * <p>The description of the storage.</p>
     */
    @NameInMap("Sd")
    public StorageDescriptorModel sd;

    /**
     * <p>The storage policy.</p>
     * 
     * <strong>example:</strong>
     * <p>StoragePolicy</p>
     */
    @NameInMap("StoragePolicy")
    public String storagePolicy;

    /**
     * <p>The information about the subpartition column.</p>
     * 
     * <strong>example:</strong>
     * <p>SubpartitionColumn</p>
     */
    @NameInMap("SubpartitionColumn")
    public String subpartitionColumn;

    /**
     * <p>The number of subpartitions.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("SubpartitionCount")
    public Long subpartitionCount;

    /**
     * <p>The subpartition type.</p>
     * 
     * <strong>example:</strong>
     * <p>SubpartitionColumn</p>
     */
    @NameInMap("SubpartitionType")
    public String subpartitionType;

    /**
     * <p>The name of the table engine.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("TableEngineName")
    public String tableEngineName;

    /**
     * <p>The name of the logical table.</p>
     * 
     * <strong>example:</strong>
     * <p>tableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The table type.</p>
     * 
     * <strong>example:</strong>
     * <p>external_table</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>The table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TblId")
    public Long tblId;

    /**
     * <p>Indicates whether the table is a temporary table.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Temporary")
    public Boolean temporary;

    /**
     * <p>The time when the table was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05 13:17:55</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The normalized SQL statement that is used to create the view.</p>
     * 
     * <strong>example:</strong>
     * <p>ViewExpandedText</p>
     */
    @NameInMap("ViewExpandedText")
    public String viewExpandedText;

    /**
     * <p>The SQL statement used to create the view.</p>
     * 
     * <strong>example:</strong>
     * <p>ViewOriginalText</p>
     */
    @NameInMap("ViewOriginalText")
    public String viewOriginalText;

    /**
     * <p>The security mode of the view.</p>
     * 
     * <strong>example:</strong>
     * <p>ViewSecurityMode</p>
     */
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

    public TableModel setCreatedBySource(String createdBySource) {
        this.createdBySource = createdBySource;
        return this;
    }
    public String getCreatedBySource() {
        return this.createdBySource;
    }

    public TableModel setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
        return this;
    }
    public String getCreatedByUser() {
        return this.createdByUser;
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
