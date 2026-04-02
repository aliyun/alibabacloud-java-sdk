// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmMeasureConfig extends TeaModel {
    /**
     * <p>分组维度</p>
     */
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>指标代码</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("measureCode")
    public String measureCode;

    /**
     * <p>查询时间窗口（秒）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("windowSecs")
    public Integer windowSecs;

    public static ApmMeasureConfig build(java.util.Map<String, ?> map) throws Exception {
        ApmMeasureConfig self = new ApmMeasureConfig();
        return TeaModel.build(map, self);
    }

    public ApmMeasureConfig setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public ApmMeasureConfig setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
        return this;
    }
    public String getMeasureCode() {
        return this.measureCode;
    }

    public ApmMeasureConfig setWindowSecs(Integer windowSecs) {
        this.windowSecs = windowSecs;
        return this;
    }
    public Integer getWindowSecs() {
        return this.windowSecs;
    }

}
