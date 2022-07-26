// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ColumnStatisticsObj extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("ColumnStatisticsData")
    public ColumnStatisticsObjColumnStatisticsData columnStatisticsData;

    @NameInMap("ColumnType")
    public String columnType;

    public static ColumnStatisticsObj build(java.util.Map<String, ?> map) throws Exception {
        ColumnStatisticsObj self = new ColumnStatisticsObj();
        return TeaModel.build(map, self);
    }

    public ColumnStatisticsObj setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ColumnStatisticsObj setColumnStatisticsData(ColumnStatisticsObjColumnStatisticsData columnStatisticsData) {
        this.columnStatisticsData = columnStatisticsData;
        return this;
    }
    public ColumnStatisticsObjColumnStatisticsData getColumnStatisticsData() {
        return this.columnStatisticsData;
    }

    public ColumnStatisticsObj setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public static class ColumnStatisticsObjColumnStatisticsData extends TeaModel {
        @NameInMap("StatisticsData")
        public String statisticsData;

        @NameInMap("StatisticsType")
        public String statisticsType;

        public static ColumnStatisticsObjColumnStatisticsData build(java.util.Map<String, ?> map) throws Exception {
            ColumnStatisticsObjColumnStatisticsData self = new ColumnStatisticsObjColumnStatisticsData();
            return TeaModel.build(map, self);
        }

        public ColumnStatisticsObjColumnStatisticsData setStatisticsData(String statisticsData) {
            this.statisticsData = statisticsData;
            return this;
        }
        public String getStatisticsData() {
            return this.statisticsData;
        }

        public ColumnStatisticsObjColumnStatisticsData setStatisticsType(String statisticsType) {
            this.statisticsType = statisticsType;
            return this;
        }
        public String getStatisticsType() {
            return this.statisticsType;
        }

    }

}
