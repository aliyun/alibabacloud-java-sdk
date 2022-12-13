// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsResponseBody extends TeaModel {
    // The ID of the cloud desktop. If multiple cloud desktops are created in a call, the IDs of the cloud desktops are returned.
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The ID of the order.
    // 
    // >  This parameter is returned only when the ChargeType parameter is set to PrePaid.
    @NameInMap("OrderId")
    public String orderId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsResponseBody self = new CreateDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsResponseBody setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public CreateDesktopsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
