// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualMFADeviceResponse self = new DeleteVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualMFADeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
