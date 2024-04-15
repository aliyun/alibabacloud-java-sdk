// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class LockVirtualMFADeviceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LockVirtualMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockVirtualMFADeviceResponseBody self = new LockVirtualMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public LockVirtualMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
