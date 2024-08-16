// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6DF9A765-BCD2-5C7E-8C32-C35C8A361A39</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody self = new RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
