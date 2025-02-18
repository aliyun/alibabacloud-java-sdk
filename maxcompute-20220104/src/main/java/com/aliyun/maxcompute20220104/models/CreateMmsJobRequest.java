// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsJobRequest extends TeaModel {
    @NameInMap("columnMapping")
    public java.util.Map<String, String> columnMapping;

    @NameInMap("dstDbName")
    public String dstDbName;

    @NameInMap("dstSchemaName")
    public String dstSchemaName;

    @NameInMap("enableVerification")
    public Boolean enableVerification;

    @NameInMap("eta")
    public String eta;

    @NameInMap("increment")
    public Boolean increment;

    @NameInMap("name")
    public String name;

    @NameInMap("others")
    public java.util.Map<String, ?> others;

    @NameInMap("partitionFilters")
    public java.util.Map<String, String> partitionFilters;

    @NameInMap("partitions")
    public java.util.List<Long> partitions;

    @NameInMap("schemaOnly")
    public Boolean schemaOnly;

    @NameInMap("sourceId")
    public Long sourceId;

    @NameInMap("sourceName")
    public String sourceName;

    @NameInMap("srcDbName")
    public String srcDbName;

    @NameInMap("srcSchemaName")
    public String srcSchemaName;

    @NameInMap("tableBlackList")
    public java.util.List<String> tableBlackList;

    @NameInMap("tableMapping")
    public java.util.Map<String, String> tableMapping;

    @NameInMap("tableWhiteList")
    public java.util.List<String> tableWhiteList;

    @NameInMap("tables")
    public java.util.List<String> tables;

    /**
     * <p>MOCK, HIVE: hive udtf task, HIVE_DATAX: hive datax task, COPY_TASK: odps Copy Task, ODPS_INSERT_OVERWRITE: odps simple insert overwrite task, MC2MC_VERIFY, OSS, HIVE_OSS</p>
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
