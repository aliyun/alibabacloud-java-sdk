// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class LockMfaDeviceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LockMfaDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockMfaDeviceResponseBody self = new LockMfaDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public LockMfaDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
