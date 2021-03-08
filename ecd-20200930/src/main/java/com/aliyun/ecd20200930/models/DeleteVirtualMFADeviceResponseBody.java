// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualMFADeviceResponseBody self = new DeleteVirtualMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
