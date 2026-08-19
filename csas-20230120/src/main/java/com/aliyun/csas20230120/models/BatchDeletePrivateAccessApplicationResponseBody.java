// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeletePrivateAccessApplicationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>170A9DD6-DECA-5E8F-8B0F-4C3B80C0644A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeletePrivateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePrivateAccessApplicationResponseBody self = new BatchDeletePrivateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeletePrivateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
