// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceGroupMatchDevicesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>578B9ADD-FB3E-57E4-AB7D-77BC9D39B591</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDeviceGroupMatchDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceGroupMatchDevicesResponseBody self = new AddDeviceGroupMatchDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDeviceGroupMatchDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
