// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceSafetyLockResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

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
