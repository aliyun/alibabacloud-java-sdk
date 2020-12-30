// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EnableLayer7CCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLayer7CCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLayer7CCRuleResponseBody self = new EnableLayer7CCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLayer7CCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
