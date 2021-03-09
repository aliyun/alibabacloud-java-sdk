// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class LockVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static LockVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        LockVirtualMFADeviceResponse self = new LockVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public LockVirtualMFADeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
