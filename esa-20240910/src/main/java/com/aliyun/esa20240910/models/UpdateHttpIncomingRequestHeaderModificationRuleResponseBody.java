// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingRequestHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BFEF3861-8BB7-5B63-954C-6575EA7FB2CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHttpIncomingRequestHeaderModificationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingRequestHeaderModificationRuleResponseBody self = new UpdateHttpIncomingRequestHeaderModificationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
