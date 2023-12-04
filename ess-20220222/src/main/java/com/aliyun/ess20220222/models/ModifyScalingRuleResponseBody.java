// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleResponseBody self = new ModifyScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
