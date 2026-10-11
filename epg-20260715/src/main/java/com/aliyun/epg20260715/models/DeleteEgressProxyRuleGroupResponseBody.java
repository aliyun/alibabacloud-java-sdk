// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyRuleGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019F3A67-2D1B-537B-B08D-B2DEB69E8E8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEgressProxyRuleGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyRuleGroupResponseBody self = new DeleteEgressProxyRuleGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyRuleGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
