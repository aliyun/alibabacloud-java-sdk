// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsTimerRequest extends TeaModel {
    /**
     * <p>A map of source column names to target column names.</p>
     */
    @NameInMap("columnMapping")
    public java.util.Map<String, String> columnMapping;

    /**
     * <p>Specifies whether to migrate table data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableDataMigration")
    public Boolean enableDataMigration;

    /**
     * <p>Specifies whether to migrate the table schema.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSchemaMigration")
    public Boolean enableSchemaMigration;

    /**
     * <p>Specifies whether to enable data verification. If set to <code>true</code>, the system runs a <code>SELECT COUNT(*)</code> query on both the source and target tables and compares the row counts.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableVerification")
    public Boolean enableVerification;

    /**
     * <p>The name of the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>planA</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Other configuration settings.</p>
     */
    @NameInMap("others")
    public java.util.Map<String, ?> others;

    /**
     * <p>A map of table names to their corresponding partition filter expressions.</p>
     */
    @NameInMap("partitionFilters")
    public java.util.Map<String, String> partitionFilters;

    /**
     * <p>A list of IDs for the table partitions to migrate. This parameter takes effect only when the <code>type</code> parameter is set to <code>Partitions</code>.</p>
     */
    @NameInMap("partitions")
    public java.util.List<Long> partitions;

    /**
     * <p>The schedule type for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>The ID of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>2000014</p>
     */
    @NameInMap("sourceId")
    public Long sourceId;

    /**
     * <p>The name of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>src_db</p>
     */
    @NameInMap("srcDbName")
    public String srcDbName;

    /**
     * <p>A blacklist of tables to exclude from the migration. This parameter takes effect only when the <code>type</code> parameter is set to <code>Database</code>.</p>
     */
    @NameInMap("tableBlackList")
    public java.util.List<String> tableBlackList;

    /**
     * <p>A map of source table names to target table names.</p>
     */
    @NameInMap("tableMapping")
    public java.util.Map<String, String> tableMapping;

    /**
     * <p>A whitelist of tables to migrate. This parameter takes effect only when the <code>type</code> parameter is set to <code>Database</code>. If omitted, all tables in the source database are migrated.</p>
     */
    @NameInMap("tableWhiteList")
    public java.util.List<String> tableWhiteList;

    /**
     * <p>A list of table names to migrate. This parameter takes effect only when the <code>type</code> parameter is set to <code>Tables</code>.</p>
     */
    @NameInMap("tables")
    public java.util.List<String> tables;

    /**
     * <p>The time to run the scheduled task. If <code>scheduleType</code> is set to <code>Daily</code>, the value is the time in <code>HH:MM</code> format. If <code>scheduleType</code> is set to <code>Hourly</code>, the value is the minute of the hour (<code>MM</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>12:00</p>
     */
    @NameInMap("value")
    public String value;

    public static CreateMmsTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsTimerRequest self = new CreateMmsTimerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMmsTimerRequest setColumnMapping(java.util.Map<String, String> columnMapping) {
        this.columnMapping = columnMapping;
        return this;
    }
    public java.util.Map<String, String> getColumnMapping() {
        return this.columnMapping;
    }

    public CreateMmsTimerRequest setEnableDataMigration(Boolean enableDataMigration) {
        this.enableDataMigration = enableDataMigration;
        return this;
    }
    public Boolean getEnableDataMigration() {
        return this.enableDataMigration;
    }

    public CreateMmsTimerRequest setEnableSchemaMigration(Boolean enableSchemaMigration) {
        this.enableSchemaMigration = enableSchemaMigration;
        return this;
    }
    public Boolean getEnableSchemaMigration() {
        return this.enableSchemaMigration;
    }

    public CreateMmsTimerRequest setEnableVerification(Boolean enableVerification) {
        this.enableVerification = enableVerification;
        return this;
    }
    public Boolean getEnableVerification() {
        return this.enableVerification;
    }

    public CreateMmsTimerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMmsTimerRequest setOthers(java.util.Map<String, ?> others) {
        this.others = others;
        return this;
    }
    public java.util.Map<String, ?> getOthers() {
        return this.others;
    }

    public CreateMmsTimerRequest setPartitionFilters(java.util.Map<String, String> partitionFilters) {
        this.partitionFilters = partitionFilters;
        return this;
    }
    public java.util.Map<String, String> getPartitionFilters() {
        return this.partitionFilters;
    }

    public CreateMmsTimerRequest setPartitions(java.util.List<Long> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Long> getPartitions() {
        return this.partitions;
    }

    public CreateMmsTimerRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateMmsTimerRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public CreateMmsTimerRequest setSrcDbName(String srcDbName) {
        this.srcDbName = srcDbName;
        return this;
    }
    public String getSrcDbName() {
        return this.srcDbName;
    }

    public CreateMmsTimerRequest setTableBlackList(java.util.List<String> tableBlackList) {
        this.tableBlackList = tableBlackList;
        return this;
    }
    public java.util.List<String> getTableBlackList() {
        return this.tableBlackList;
    }

    public CreateMmsTimerRequest setTableMapping(java.util.Map<String, String> tableMapping) {
        this.tableMapping = tableMapping;
        return this;
    }
    public java.util.Map<String, String> getTableMapping() {
        return this.tableMapping;
    }

    public CreateMmsTimerRequest setTableWhiteList(java.util.List<String> tableWhiteList) {
        this.tableWhiteList = tableWhiteList;
        return this;
    }
    public java.util.List<String> getTableWhiteList() {
        return this.tableWhiteList;
    }

    public CreateMmsTimerRequest setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

    public CreateMmsTimerRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
