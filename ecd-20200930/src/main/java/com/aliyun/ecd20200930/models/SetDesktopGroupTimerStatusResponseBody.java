// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerStatusResponseBody extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("OrderIds")
    public java.util.List<String> orderIds;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDesktopGroupTimerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerStatusResponseBody self = new SetDesktopGroupTimerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerStatusResponseBody setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetDesktopGroupTimerStatusResponseBody setOrderIds(java.util.List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<String> getOrderIds() {
        return this.orderIds;
    }

    public SetDesktopGroupTimerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
