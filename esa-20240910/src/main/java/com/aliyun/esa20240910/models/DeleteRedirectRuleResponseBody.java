// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRedirectRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF9B849D-D847-5B16-9371-8ECB557A5921</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRedirectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRedirectRuleResponseBody self = new DeleteRedirectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRedirectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
