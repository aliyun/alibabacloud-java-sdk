// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewAndroidInstanceGroupsResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

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
