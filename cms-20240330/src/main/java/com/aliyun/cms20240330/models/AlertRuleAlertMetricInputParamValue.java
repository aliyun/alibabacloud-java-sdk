// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInputParamValue extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("value")
    public String value;

    public static AlertRuleAlertMetricInputParamValue build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleAlertMetricInputParamValue self = new AlertRuleAlertMetricInputParamValue();
        return TeaModel.build(map, self);
    }

    public AlertRuleAlertMetricInputParamValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlertRuleAlertMetricInputParamValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
