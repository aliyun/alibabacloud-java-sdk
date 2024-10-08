// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformExpressionToMatchResponseBody extends TeaModel {
    @NameInMap("Match")
    public WafRuleMatch match;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformExpressionToMatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformExpressionToMatchResponseBody self = new TransformExpressionToMatchResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformExpressionToMatchResponseBody setMatch(WafRuleMatch match) {
        this.match = match;
        return this;
    }
    public WafRuleMatch getMatch() {
        return this.match;
    }

    public TransformExpressionToMatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
