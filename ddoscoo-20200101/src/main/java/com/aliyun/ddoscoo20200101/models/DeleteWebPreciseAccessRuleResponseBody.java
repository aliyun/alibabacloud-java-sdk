// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebPreciseAccessRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWebPreciseAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebPreciseAccessRuleResponseBody self = new DeleteWebPreciseAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWebPreciseAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
