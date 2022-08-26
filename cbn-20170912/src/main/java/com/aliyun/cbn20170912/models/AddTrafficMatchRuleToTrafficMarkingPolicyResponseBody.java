// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody self = new AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
