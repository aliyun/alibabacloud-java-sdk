// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsLiteResponseBody extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDesktopsLiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsLiteResponseBody self = new CreateDesktopsLiteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsLiteResponseBody setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public CreateDesktopsLiteResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDesktopsLiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
