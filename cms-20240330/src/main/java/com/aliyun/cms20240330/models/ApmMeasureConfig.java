// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmMeasureConfig extends TeaModel {
    /**
     * <p>An array of dimension keys used to group the results.</p>
     */
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>The unique code that identifies the metric.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("measureCode")
    public String measureCode;

    /**
     * <p>The aggregation period in seconds, which determines the time granularity of data points.</p>
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
