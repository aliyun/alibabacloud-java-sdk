// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the cloud computers that are created. If multiple cloud computers are created, multiple IDs are returned.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the order.</p>
     * <br>
     * <p>> This parameter is returned only when you set the ChargeType parameter to PrePaid.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
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
