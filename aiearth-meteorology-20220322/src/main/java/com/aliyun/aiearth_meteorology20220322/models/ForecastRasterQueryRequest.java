// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class ForecastRasterQueryRequest extends TeaModel {
    @NameInMap("duration")
    public String duration;

    @NameInMap("element")
    public String element;

    public static ForecastRasterQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ForecastRasterQueryRequest self = new ForecastRasterQueryRequest();
        return TeaModel.build(map, self);
    }

    public ForecastRasterQueryRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public ForecastRasterQueryRequest setElement(String element) {
        this.element = element;
        return this;
    }
    public String getElement() {
        return this.element;
    }

}
