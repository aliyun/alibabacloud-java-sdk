// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleAction extends TeaModel {
    @NameInMap("actions")
    public java.util.List<String> actions;

    public static AlertRuleAction build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleAction self = new AlertRuleAction();
        return TeaModel.build(map, self);
    }

    public AlertRuleAction setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

}
