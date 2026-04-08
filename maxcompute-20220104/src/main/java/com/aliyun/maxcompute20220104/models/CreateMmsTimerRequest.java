// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsTimerRequest extends TeaModel {
    @NameInMap("columnMapping")
    public java.util.Map<String, String> columnMapping;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableDataMigration")
    public Boolean enableDataMigration;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSchemaMigration")
    public Boolean enableSchemaMigration;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableVerification")
    public Boolean enableVerification;

    /**
     * <strong>example:</strong>
     * <p>planA</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("others")
    public java.util.Map<String, ?> others;

    @NameInMap("partitionFilters")
    public java.util.Map<String, String> partitionFilters;

    @NameInMap("partitions")
    public java.util.List<Long> partitions;

    /**
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <strong>example:</strong>
     * <p>2000014</p>
     */
    @NameInMap("sourceId")
    public Long sourceId;

    /**
     * <strong>example:</strong>
     * <p>src_db</p>
     */
    @NameInMap("srcDbName")
    public String srcDbName;

    @NameInMap("tableBlackList")
    public java.util.List<String> tableBlackList;

    @NameInMap("tableMapping")
    public java.util.Map<String, String> tableMapping;

    @NameInMap("tableWhiteList")
    public java.util.List<String> tableWhiteList;

    @NameInMap("tables")
    public java.util.List<String> tables;

    /**
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
