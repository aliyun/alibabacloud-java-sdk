// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the auto scaling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu-trigger</p>
     */
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
