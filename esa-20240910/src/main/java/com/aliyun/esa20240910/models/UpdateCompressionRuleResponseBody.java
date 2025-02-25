// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCompressionRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE8EB0DE-3267-53D1-AB83-F36377D63FD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCompressionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompressionRuleResponseBody self = new UpdateCompressionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCompressionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
