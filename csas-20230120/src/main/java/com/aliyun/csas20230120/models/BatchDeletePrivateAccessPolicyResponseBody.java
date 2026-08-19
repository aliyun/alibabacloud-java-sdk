// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeletePrivateAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019F3F8C-1127-5152-80E0-4F9D45DB5756</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeletePrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePrivateAccessPolicyResponseBody self = new BatchDeletePrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeletePrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
