// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DisableLayer7CCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLayer7CCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLayer7CCRuleResponseBody self = new DisableLayer7CCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLayer7CCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
