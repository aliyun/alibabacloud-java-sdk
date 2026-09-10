// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusMetricParamValue extends TeaModel {
    /**
     * <p>The parameter name.</p>
     * 
     * <strong>example:</strong>
     * <p>threshold</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
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
