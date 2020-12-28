// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateTablePartitionColumnStatisticsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // ColumnStatisticsList
    @NameInMap("ColumnStatisticsList")
    public java.util.List<ColumnStatistics> columnStatisticsList;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // Engine
    @NameInMap("Engine")
    public String engine;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    // ValidWriteIdList, optional
    @NameInMap("ValidWriteIdList")
    public String validWriteIdList;

    // WriteId, optional
    @NameInMap("WriteId")
    public String writeId;

    // IsStatsCompliant
    @NameInMap("IsStatsCompliant")
    public Boolean isStatsCompliant;

    public static UpdateTablePartitionColumnStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTablePartitionColumnStatisticsRequest self = new UpdateTablePartitionColumnStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTablePartitionColumnStatisticsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public UpdateTablePartitionColumnStatisticsRequest setColumnStatisticsList(java.util.List<ColumnStatistics> columnStatisticsList) {
        this.columnStatisticsList = columnStatisticsList;
        return this;
    }
    public java.util.List<ColumnStatistics> getColumnStatisticsList() {
        return this.columnStatisticsList;
    }

    public UpdateTablePartitionColumnStatisticsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public UpdateTablePartitionColumnStatisticsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public UpdateTablePartitionColumnStatisticsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public UpdateTablePartitionColumnStatisticsRequest setValidWriteIdList(String validWriteIdList) {
        this.validWriteIdList = validWriteIdList;
        return this;
    }
    public String getValidWriteIdList() {
        return this.validWriteIdList;
    }

    public UpdateTablePartitionColumnStatisticsRequest setWriteId(String writeId) {
        this.writeId = writeId;
        return this;
    }
    public String getWriteId() {
        return this.writeId;
    }

    public UpdateTablePartitionColumnStatisticsRequest setIsStatsCompliant(Boolean isStatsCompliant) {
        this.isStatsCompliant = isStatsCompliant;
        return this;
    }
    public Boolean getIsStatsCompliant() {
        return this.isStatsCompliant;
    }

}
