// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAndroidInstanceGroupResponseBody extends TeaModel {
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAndroidInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndroidInstanceGroupResponseBody self = new CreateAndroidInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndroidInstanceGroupResponseBody setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public CreateAndroidInstanceGroupResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAndroidInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
