// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UnlockMfaDeviceResponseBody extends TeaModel {
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
