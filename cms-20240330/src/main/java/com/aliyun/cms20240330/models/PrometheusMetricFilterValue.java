// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusMetricFilterValue extends TeaModel {
    @NameInMap("dim")
    public String dim;

    @NameInMap("opt")
    public String opt;

    @NameInMap("value")
    public String value;

    public static PrometheusMetricFilterValue build(java.util.Map<String, ?> map) throws Exception {
        PrometheusMetricFilterValue self = new PrometheusMetricFilterValue();
        return TeaModel.build(map, self);
    }

    public PrometheusMetricFilterValue setDim(String dim) {
        this.dim = dim;
        return this;
    }
    public String getDim() {
        return this.dim;
    }

    public PrometheusMetricFilterValue setOpt(String opt) {
        this.opt = opt;
        return this;
    }
    public String getOpt() {
        return this.opt;
    }

    public PrometheusMetricFilterValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
