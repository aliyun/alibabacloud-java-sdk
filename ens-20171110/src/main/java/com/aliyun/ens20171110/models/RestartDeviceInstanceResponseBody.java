// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartDeviceInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>388AA3AE-CE49-5FF4-8CF5-A03D2BBA1C9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDeviceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDeviceInstanceResponseBody self = new RestartDeviceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDeviceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
