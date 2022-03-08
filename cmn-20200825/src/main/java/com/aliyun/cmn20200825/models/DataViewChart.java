// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DataViewChart extends TeaModel {
    // 图表类型
    @NameInMap("ChartType")
    public String chartType;

    // 数据视图ID
    @NameInMap("DataViewId")
    public String dataViewId;

    // 数据源类型
    @NameInMap("DataViewSource")
    public String dataViewSource;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 布局配置
    @NameInMap("Grid")
    public String grid;

    public static DataViewChart build(java.util.Map<String, ?> map) throws Exception {
        DataViewChart self = new DataViewChart();
        return TeaModel.build(map, self);
    }

    public DataViewChart setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public DataViewChart setDataViewId(String dataViewId) {
        this.dataViewId = dataViewId;
        return this;
    }
    public String getDataViewId() {
        return this.dataViewId;
    }

    public DataViewChart setDataViewSource(String dataViewSource) {
        this.dataViewSource = dataViewSource;
        return this;
    }
    public String getDataViewSource() {
        return this.dataViewSource;
    }

    public DataViewChart setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DataViewChart setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DataViewChart setGrid(String grid) {
        this.grid = grid;
        return this;
    }
    public String getGrid() {
        return this.grid;
    }

}
