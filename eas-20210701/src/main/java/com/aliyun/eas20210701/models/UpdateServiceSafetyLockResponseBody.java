// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceSafetyLockResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>service safety lock updated to dangerous</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E089D584-B6F4-50C4-9902-DA2295B7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceSafetyLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSafetyLockResponseBody self = new UpdateServiceSafetyLockResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSafetyLockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceSafetyLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
