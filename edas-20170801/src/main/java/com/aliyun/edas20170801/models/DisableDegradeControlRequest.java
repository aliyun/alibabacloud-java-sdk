// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableDegradeControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RuleId")
    public String ruleId;

    public static DisableDegradeControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDegradeControlRequest self = new DisableDegradeControlRequest();
        return TeaModel.build(map, self);
    }

    public DisableDegradeControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DisableDegradeControlRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
