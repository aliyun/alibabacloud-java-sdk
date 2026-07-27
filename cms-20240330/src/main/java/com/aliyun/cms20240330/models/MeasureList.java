// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MeasureList extends TeaModel {
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("measureCode")
    public String measureCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("windowSecs")
    public Integer windowSecs;

    public static MeasureList build(java.util.Map<String, ?> map) throws Exception {
        MeasureList self = new MeasureList();
        return TeaModel.build(map, self);
    }

    public MeasureList setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public MeasureList setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
        return this;
    }
    public String getMeasureCode() {
        return this.measureCode;
    }

    public MeasureList setWindowSecs(Integer windowSecs) {
        this.windowSecs = windowSecs;
        return this;
    }
    public Integer getWindowSecs() {
        return this.windowSecs;
    }

}
