// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static DeleteApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationScalingRuleRequest self = new DeleteApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
