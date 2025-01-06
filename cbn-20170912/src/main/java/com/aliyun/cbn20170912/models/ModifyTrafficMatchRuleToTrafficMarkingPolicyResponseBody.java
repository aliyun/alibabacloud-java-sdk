// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13526224-5780-4426-8ADF-BC8B08700F23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody self = new ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
