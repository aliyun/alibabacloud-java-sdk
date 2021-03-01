// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableFlowControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RuleId")
    public String ruleId;

    public static DisableFlowControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowControlRequest self = new DisableFlowControlRequest();
        return TeaModel.build(map, self);
    }

    public DisableFlowControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DisableFlowControlRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
