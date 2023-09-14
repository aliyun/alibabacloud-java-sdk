// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableDeletionProtectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDeletionProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDeletionProtectionResponseBody self = new EnableDeletionProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDeletionProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
