// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAlertMetricInputFilterValue extends TeaModel {
    /**
     * <p>过滤条件的维度</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rootIp</p>
     */
    @NameInMap("dim")
    public String dim;

    /**
     * <p>过滤条件操作符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("opt")
    public String opt;

    /**
     * <p>过滤条件值</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
