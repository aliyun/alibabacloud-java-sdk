// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsJobRequest extends TeaModel {
    /**
     * <p>{Source column name: Destination column name}</p>
     */
    @NameInMap("columnMapping")
    public java.util.Map<String, String> columnMapping;

    /**
     * <p>The destination MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>mms_test</p>
     */
    @NameInMap("dstDbName")
    public String dstDbName;

    /**
     * <p>The destination MaxCompute schema.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dstSchemaName")
    public String dstSchemaName;

    /**
     * <p>Specifies whether to migrate table data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableDataMigration")
    public Boolean enableDataMigration;

    /**
     * <p>Specifies whether to migrate table schemas.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSchemaMigration")
    public Boolean enableSchemaMigration;

    /**
     * <p>Specifies whether to enable data verification. The current verification method is to execute SELECT COUNT(\*) on the source and destination to compare the number of rows.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableVerification")
    public Boolean enableVerification;

    /**
     * <p>The expected completion time of the migration. Note: A smaller eta value gives the migration task higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-04</p>
     */
    @NameInMap("eta")
    public String eta;

    /**
     * <p>Specifies whether to perform an incremental migration. In an incremental migration, only new or changed partitions are migrated. Note that changed partitions are re-migrated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("increment")
    public Boolean increment;

    /**
     * <p>The name of the migration job.</p>
     * 
     * <strong>example:</strong>
     * <p>migrate_db_1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Other configuration information.</p>
     */
    @NameInMap("others")
    public java.util.Map<String, ?> others;

    /**
     * <p>{Table name: Partition filter expression}</p>
     */
    @NameInMap("partitionFilters")
    public java.util.Map<String, String> partitionFilters;

    /**
     * <p>The list of partition IDs.</p>
     */
    @NameInMap("partitions")
    public java.util.List<Long> partitions;

    /**
     * <p>Specifies whether to migrate only metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("schemaOnly")
    public Boolean schemaOnly;

    /**
     * <p>The ID of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>2000014</p>
     */
    @NameInMap("sourceId")
    public Long sourceId;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("sourceName")
    public String sourceName;

    /**
     * <p>The name of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>src_db</p>
     */
    @NameInMap("srcDbName")
    public String srcDbName;

    /**
     * <p>The name of the source schema. This is the schema in a Layer 3 namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("srcSchemaName")
    public String srcSchemaName;

    /**
     * <p>The blacklist of tables.</p>
     */
    @NameInMap("tableBlackList")
    public java.util.List<String> tableBlackList;

    /**
     * <p>{Source table: Destination table}</p>
     */
    @NameInMap("tableMapping")
    public java.util.Map<String, String> tableMapping;

    /**
     * <p>The whitelist of tables. Note: If you configure both a whitelist and a blacklist, only the blacklist takes effect.</p>
     */
    @NameInMap("tableWhiteList")
    public java.util.List<String> tableWhiteList;

    /**
     * <p>The list of table names.</p>
     */
    @NameInMap("tables")
    public java.util.List<String> tables;

    /**
     * <p>The type of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>BIGQUERY</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static CreateMmsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsJobRequest self = new CreateMmsJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateMmsJobRequest setColumnMapping(java.util.Map<String, String> columnMapping) {
        this.columnMapping = columnMapping;
        return this;
    }
    public java.util.Map<String, String> getColumnMapping() {
        return this.columnMapping;
    }

    public CreateMmsJobRequest setDstDbName(String dstDbName) {
        this.dstDbName = dstDbName;
        return this;
    }
    public String getDstDbName() {
        return this.dstDbName;
    }

    public CreateMmsJobRequest setDstSchemaName(String dstSchemaName) {
        this.dstSchemaName = dstSchemaName;
        return this;
    }
    public String getDstSchemaName() {
        return this.dstSchemaName;
    }

    public CreateMmsJobRequest setEnableDataMigration(Boolean enableDataMigration) {
        this.enableDataMigration = enableDataMigration;
        return this;
    }
    public Boolean getEnableDataMigration() {
        return this.enableDataMigration;
    }

    public CreateMmsJobRequest setEnableSchemaMigration(Boolean enableSchemaMigration) {
        this.enableSchemaMigration = enableSchemaMigration;
        return this;
    }
    public Boolean getEnableSchemaMigration() {
        return this.enableSchemaMigration;
    }

    public CreateMmsJobRequest setEnableVerification(Boolean enableVerification) {
        this.enableVerification = enableVerification;
        return this;
    }
    public Boolean getEnableVerification() {
        return this.enableVerification;
    }

    public CreateMmsJobRequest setEta(String eta) {
        this.eta = eta;
        return this;
    }
    public String getEta() {
        return this.eta;
    }

    public CreateMmsJobRequest setIncrement(Boolean increment) {
        this.increment = increment;
        return this;
    }
    public Boolean getIncrement() {
        return this.increment;
    }

    public CreateMmsJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMmsJobRequest setOthers(java.util.Map<String, ?> others) {
        this.others = others;
        return this;
    }
    public java.util.Map<String, ?> getOthers() {
        return this.others;
    }

    public CreateMmsJobRequest setPartitionFilters(java.util.Map<String, String> partitionFilters) {
        this.partitionFilters = partitionFilters;
        return this;
    }
    public java.util.Map<String, String> getPartitionFilters() {
        return this.partitionFilters;
    }

    public CreateMmsJobRequest setPartitions(java.util.List<Long> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Long> getPartitions() {
        return this.partitions;
    }

    public CreateMmsJobRequest setSchemaOnly(Boolean schemaOnly) {
        this.schemaOnly = schemaOnly;
        return this;
    }
    public Boolean getSchemaOnly() {
        return this.schemaOnly;
    }

    public CreateMmsJobRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public CreateMmsJobRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public CreateMmsJobRequest setSrcDbName(String srcDbName) {
        this.srcDbName = srcDbName;
        return this;
    }
    public String getSrcDbName() {
        return this.srcDbName;
    }

    public CreateMmsJobRequest setSrcSchemaName(String srcSchemaName) {
        this.srcSchemaName = srcSchemaName;
        return this;
    }
    public String getSrcSchemaName() {
        return this.srcSchemaName;
    }

    public CreateMmsJobRequest setTableBlackList(java.util.List<String> tableBlackList) {
        this.tableBlackList = tableBlackList;
        return this;
    }
    public java.util.List<String> getTableBlackList() {
        return this.tableBlackList;
    }

    public CreateMmsJobRequest setTableMapping(java.util.Map<String, String> tableMapping) {
        this.tableMapping = tableMapping;
        return this;
    }
    public java.util.Map<String, String> getTableMapping() {
        return this.tableMapping;
    }

    public CreateMmsJobRequest setTableWhiteList(java.util.List<String> tableWhiteList) {
        this.tableWhiteList = tableWhiteList;
        return this;
    }
    public java.util.List<String> getTableWhiteList() {
        return this.tableWhiteList;
    }

    public CreateMmsJobRequest setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

    public CreateMmsJobRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
