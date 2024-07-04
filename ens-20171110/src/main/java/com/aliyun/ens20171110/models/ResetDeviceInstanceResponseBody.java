// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetDeviceInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60C0D889-9C80-5D68-8645-6A55C58E72CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetDeviceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceInstanceResponseBody self = new ResetDeviceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDeviceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
