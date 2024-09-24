// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockMfaDeviceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9BD39C60-4E38-43BE-BA2F-69136C6C5190</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnlockMfaDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockMfaDeviceResponseBody self = new UnlockMfaDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockMfaDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
