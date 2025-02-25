// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpRequestHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHttpRequestHeaderModificationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpRequestHeaderModificationRuleResponseBody self = new UpdateHttpRequestHeaderModificationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHttpRequestHeaderModificationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
