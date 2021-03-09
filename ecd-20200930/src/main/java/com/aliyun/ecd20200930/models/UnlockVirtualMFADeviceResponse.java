// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnlockVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnlockVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockVirtualMFADeviceResponse self = new UnlockVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnlockVirtualMFADeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
