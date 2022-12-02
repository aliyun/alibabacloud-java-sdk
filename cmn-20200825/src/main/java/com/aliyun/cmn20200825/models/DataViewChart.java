// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DataViewChart extends TeaModel {
    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("DataViewId")
    public String dataViewId;

    @NameInMap("DataViewSource")
    public String dataViewSource;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

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
