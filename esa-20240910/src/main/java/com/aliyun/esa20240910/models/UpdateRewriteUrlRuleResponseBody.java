// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRewriteUrlRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRewriteUrlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRewriteUrlRuleResponseBody self = new UpdateRewriteUrlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRewriteUrlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
