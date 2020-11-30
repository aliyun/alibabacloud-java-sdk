// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DisableLayer7CCRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableLayer7CCRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLayer7CCRuleResponse self = new DisableLayer7CCRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableLayer7CCRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
