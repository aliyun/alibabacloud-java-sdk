// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCompressionRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCompressionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompressionRuleResponseBody self = new DeleteCompressionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCompressionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
