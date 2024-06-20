// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>49AD2F34-694A-4024-9B0E-DDCFC59CCC13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRuleResponseBody self = new DeleteNetworkRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
