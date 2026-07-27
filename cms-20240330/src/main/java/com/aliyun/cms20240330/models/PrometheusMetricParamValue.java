// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusMetricParamValue extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("value")
    public String value;

    public static PrometheusMetricParamValue build(java.util.Map<String, ?> map) throws Exception {
        PrometheusMetricParamValue self = new PrometheusMetricParamValue();
        return TeaModel.build(map, self);
    }

    public PrometheusMetricParamValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PrometheusMetricParamValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
