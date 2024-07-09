// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the desktop group.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The IDs of the orders.</p>
     */
    @NameInMap("OrderIds")
    public java.util.List<String> orderIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3EB7FCEE-D731-4948-85A3-4B2C341CA983</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public CreateDesktopGroupResponseBody setOrderIds(java.util.List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<String> getOrderIds() {
        return this.orderIds;
    }

    public CreateDesktopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
