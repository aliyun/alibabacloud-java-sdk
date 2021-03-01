// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableDegradeControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RuleId")
    public String ruleId;

    public static EnableDegradeControlRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDegradeControlRequest self = new EnableDegradeControlRequest();
        return TeaModel.build(map, self);
    }

    public EnableDegradeControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EnableDegradeControlRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
