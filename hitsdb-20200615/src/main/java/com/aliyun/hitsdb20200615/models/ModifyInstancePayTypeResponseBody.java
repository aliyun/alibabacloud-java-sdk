// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyInstancePayTypeResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstancePayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancePayTypeResponseBody self = new ModifyInstancePayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstancePayTypeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstancePayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyInstancePayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
