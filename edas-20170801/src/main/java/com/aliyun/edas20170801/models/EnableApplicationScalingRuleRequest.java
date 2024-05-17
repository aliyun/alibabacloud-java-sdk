// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableApplicationScalingRuleRequest extends TeaModel {
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

    public static EnableApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationScalingRuleRequest self = new EnableApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EnableApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

}
