// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentPackageResponseBody extends TeaModel {
    /**
     * <p>A list of package IDs.</p>
     */
    @NameInMap("MobileAgentPackageIds")
    public java.util.List<String> mobileAgentPackageIds;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22326560487****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMobileAgentPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentPackageResponseBody self = new CreateMobileAgentPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentPackageResponseBody setMobileAgentPackageIds(java.util.List<String> mobileAgentPackageIds) {
        this.mobileAgentPackageIds = mobileAgentPackageIds;
        return this;
    }
    public java.util.List<String> getMobileAgentPackageIds() {
        return this.mobileAgentPackageIds;
    }

    public CreateMobileAgentPackageResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateMobileAgentPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
