// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
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
