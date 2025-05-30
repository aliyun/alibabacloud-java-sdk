// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class BindMFADeviceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B9AF80E4-1565-42D9-9256-0B8B0D9FD3EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindMFADeviceResponseBody self = new BindMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BindMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
