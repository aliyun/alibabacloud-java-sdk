// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTraficMatchRuleToTrafficMarkingPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddTraficMatchRuleToTrafficMarkingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTraficMatchRuleToTrafficMarkingPolicyResponseBody self = new AddTraficMatchRuleToTrafficMarkingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
