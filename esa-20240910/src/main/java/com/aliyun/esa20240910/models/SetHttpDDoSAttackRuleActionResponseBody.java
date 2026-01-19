// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackRuleActionResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetHttpDDoSAttackRuleActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackRuleActionResponseBody self = new SetHttpDDoSAttackRuleActionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackRuleActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
