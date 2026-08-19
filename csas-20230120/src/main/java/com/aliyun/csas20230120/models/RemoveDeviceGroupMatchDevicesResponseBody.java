// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveDeviceGroupMatchDevicesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveDeviceGroupMatchDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDeviceGroupMatchDevicesResponseBody self = new RemoveDeviceGroupMatchDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDeviceGroupMatchDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
