// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the auto scaling policy.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    public static DisableApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationScalingRuleRequest self = new DisableApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DisableApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
