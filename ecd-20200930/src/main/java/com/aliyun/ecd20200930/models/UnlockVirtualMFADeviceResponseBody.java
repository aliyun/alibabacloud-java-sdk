// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnlockVirtualMFADeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnlockVirtualMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockVirtualMFADeviceResponseBody self = new UnlockVirtualMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockVirtualMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
