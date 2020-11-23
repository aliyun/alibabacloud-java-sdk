// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class BindMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static BindMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindMFADeviceResponse self = new BindMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindMFADeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
