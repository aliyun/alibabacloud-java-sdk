// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewMobileAgentPackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>223684716098****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewMobileAgentPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewMobileAgentPackageResponseBody self = new RenewMobileAgentPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewMobileAgentPackageResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewMobileAgentPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
