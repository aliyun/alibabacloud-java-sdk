// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopChargeTypeResponseBody extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the cloud desktop.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Change the billing method of a cloud desktop</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopChargeTypeResponseBody self = new ModifyDesktopChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopChargeTypeResponseBody setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDesktopChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
