// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopGroupResponseBody extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderIds")
    public java.util.List<String> orderIds;

    public static CreateDesktopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopGroupResponseBody self = new CreateDesktopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDesktopGroupResponseBody setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public CreateDesktopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDesktopGroupResponseBody setOrderIds(java.util.List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<String> getOrderIds() {
        return this.orderIds;
    }

}
