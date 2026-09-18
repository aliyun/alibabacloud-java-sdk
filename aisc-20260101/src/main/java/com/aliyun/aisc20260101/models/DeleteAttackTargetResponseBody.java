// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class DeleteAttackTargetResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAttackTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackTargetResponseBody self = new DeleteAttackTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAttackTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
