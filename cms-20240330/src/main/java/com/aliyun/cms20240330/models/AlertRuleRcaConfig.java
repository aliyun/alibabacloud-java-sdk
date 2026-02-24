// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleRcaConfig extends TeaModel {
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    @NameInMap("enableRca")
    public Boolean enableRca;

    public static AlertRuleRcaConfig build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleRcaConfig self = new AlertRuleRcaConfig();
        return TeaModel.build(map, self);
    }

    public AlertRuleRcaConfig setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public AlertRuleRcaConfig setEnableRca(Boolean enableRca) {
        this.enableRca = enableRca;
        return this;
    }
    public Boolean getEnableRca() {
        return this.enableRca;
    }

}
