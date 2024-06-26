// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewAndroidInstanceGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>22326560487****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>4B886792-2051-5DB4-8AE6-C8E45D3B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewAndroidInstanceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewAndroidInstanceGroupsResponseBody self = new RenewAndroidInstanceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewAndroidInstanceGroupsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewAndroidInstanceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
