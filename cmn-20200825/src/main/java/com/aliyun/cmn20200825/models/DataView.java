// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DataView extends TeaModel {
    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 数据视图名称
    @NameInMap("DataViewName")
    public String dataViewName;

    // 描述
    @NameInMap("DataViewDescription")
    public String dataViewDescription;

    // 聚合数据
    @NameInMap("DataViewId")
    public String dataViewId;

    // 图表列表
    @NameInMap("DataViewChartList")
    public java.util.List<DataViewChart> dataViewChartList;

    public static DataView build(java.util.Map<String, ?> map) throws Exception {
        DataView self = new DataView();
        return TeaModel.build(map, self);
    }

    public DataView setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DataView setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DataView setDataViewName(String dataViewName) {
        this.dataViewName = dataViewName;
        return this;
    }
    public String getDataViewName() {
        return this.dataViewName;
    }

    public DataView setDataViewDescription(String dataViewDescription) {
        this.dataViewDescription = dataViewDescription;
        return this;
    }
    public String getDataViewDescription() {
        return this.dataViewDescription;
    }

    public DataView setDataViewId(String dataViewId) {
        this.dataViewId = dataViewId;
        return this;
    }
    public String getDataViewId() {
        return this.dataViewId;
    }

    public DataView setDataViewChartList(java.util.List<DataViewChart> dataViewChartList) {
        this.dataViewChartList = dataViewChartList;
        return this;
    }
    public java.util.List<DataViewChart> getDataViewChartList() {
        return this.dataViewChartList;
    }

}
