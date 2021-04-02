// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DisableVirtualMFAResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableVirtualMFAResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVirtualMFAResponse self = new DisableVirtualMFAResponse();
        return TeaModel.build(map, self);
    }

    public DisableVirtualMFAResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
