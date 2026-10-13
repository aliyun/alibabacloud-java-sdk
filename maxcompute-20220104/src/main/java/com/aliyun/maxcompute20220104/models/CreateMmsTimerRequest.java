// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsTimerRequest extends TeaModel {
    /**
     * <p>The mapping between source and destination column names in the {source column name: destination column name} format.</p>
     */
    @NameInMap("columnMapping")
    public java.util.Map<String, String> columnMapping;

    /**
     * <p>Specifies whether to migrate the table data.</p>
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
     * <p>Specifies whether to enable verification. Currently, the verification method executes SELECT COUNT on the source and destination to compare the number of rows.</p>
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
     * <p>Other configuration information.</p>
     */
    @NameInMap("others")
    public java.util.Map<String, ?> others;

    /**
     * <p>The partition filter expression. Configure the partition filter expression for the specified table.</p>
     */
    @NameInMap("partitionFilters")
    public java.util.Map<String, String> partitionFilters;

    /**
     * <p>The list of partition IDs for the tables to be migrated. Specify this parameter when type is set to Partitions.</p>
     */
    @NameInMap("partitions")
    public java.util.List<Long> partitions;

    /**
     * <p>The schedule type of the scheduled task. Valid values: Daily (runs daily) and Hourly (runs hourly).</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>The data source ID.</p>
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
     * <p>The list of tables to exclude from migration. Specify this parameter when type is set to Database.</p>
     */
    @NameInMap("tableBlackList")
    public java.util.List<String> tableBlackList;

    /**
     * <p>The mapping between the source table name and the destination table name.</p>
     */
    @NameInMap("tableMapping")
    public java.util.Map<String, String> tableMapping;

    /**
     * <p>The list of tables to migrate. Specify this parameter when type is set to Database. If this parameter is not specified, all tables in the corresponding database are migrated.</p>
     */
    @NameInMap("tableWhiteList")
    public java.util.List<String> tableWhiteList;

    /**
     * <p>The list of names of the tables to be migrated. Specify this parameter when type is set to Tables.</p>
     */
    @NameInMap("tables")
    public java.util.List<String> tables;

    /**
     * <p>The schedule time of the scheduled task. When scheduleType is set to Daily, the value is in the HH:MM format. When scheduleType is set to Hourly, the value is in the MM format.</p>
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
