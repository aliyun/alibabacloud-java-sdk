// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ColumnStatistics extends TeaModel {
    @NameInMap("ColumnStatisticsDesc")
    public ColumnStatisticsDesc columnStatisticsDesc;

    // ColumnStatisticsObjList
    @NameInMap("ColumnStatisticsObjList")
    public java.util.List<ColumnStatisticsObj> columnStatisticsObjList;

    // Engine for hive3+
    @NameInMap("Engine")
    public String engine;

    // IsStatsCompliant for hive3+
    @NameInMap("IsStatsCompliant")
    public Boolean isStatsCompliant;

    public static ColumnStatistics build(java.util.Map<String, ?> map) throws Exception {
        ColumnStatistics self = new ColumnStatistics();
        return TeaModel.build(map, self);
    }

    public ColumnStatistics setColumnStatisticsDesc(ColumnStatisticsDesc columnStatisticsDesc) {
        this.columnStatisticsDesc = columnStatisticsDesc;
        return this;
    }
    public ColumnStatisticsDesc getColumnStatisticsDesc() {
        return this.columnStatisticsDesc;
    }

    public ColumnStatistics setColumnStatisticsObjList(java.util.List<ColumnStatisticsObj> columnStatisticsObjList) {
        this.columnStatisticsObjList = columnStatisticsObjList;
        return this;
    }
    public java.util.List<ColumnStatisticsObj> getColumnStatisticsObjList() {
        return this.columnStatisticsObjList;
    }

    public ColumnStatistics setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ColumnStatistics setIsStatsCompliant(Boolean isStatsCompliant) {
        this.isStatsCompliant = isStatsCompliant;
        return this;
    }
    public Boolean getIsStatsCompliant() {
        return this.isStatsCompliant;
    }

}
