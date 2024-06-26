// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpgradeAndroidInstanceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>223684716098****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>310A783E-CC46-5452-A8A3-71AE5DB59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeAndroidInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAndroidInstanceGroupResponseBody self = new UpgradeAndroidInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeAndroidInstanceGroupResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpgradeAndroidInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
