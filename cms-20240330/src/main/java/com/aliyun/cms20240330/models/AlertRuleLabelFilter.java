// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleLabelFilter extends TeaModel {
    /**
     * <p>标签过滤器</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>多个标签之间的关系操作符</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("opt")
    public String opt;

    public static AlertRuleLabelFilter build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleLabelFilter self = new AlertRuleLabelFilter();
        return TeaModel.build(map, self);
    }

    public AlertRuleLabelFilter setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public AlertRuleLabelFilter setOpt(String opt) {
        this.opt = opt;
        return this;
    }
    public String getOpt() {
        return this.opt;
    }

}
