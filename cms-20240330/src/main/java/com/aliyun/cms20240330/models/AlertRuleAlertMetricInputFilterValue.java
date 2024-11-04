// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInputFilterValue extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dim")
    public String dim;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("opt")
    public String opt;

    @NameInMap("value")
    public String value;

    public static AlertRuleAlertMetricInputFilterValue build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleAlertMetricInputFilterValue self = new AlertRuleAlertMetricInputFilterValue();
        return TeaModel.build(map, self);
    }

    public AlertRuleAlertMetricInputFilterValue setDim(String dim) {
        this.dim = dim;
        return this;
    }
    public String getDim() {
        return this.dim;
    }

    public AlertRuleAlertMetricInputFilterValue setOpt(String opt) {
        this.opt = opt;
        return this;
    }
    public String getOpt() {
        return this.opt;
    }

    public AlertRuleAlertMetricInputFilterValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
