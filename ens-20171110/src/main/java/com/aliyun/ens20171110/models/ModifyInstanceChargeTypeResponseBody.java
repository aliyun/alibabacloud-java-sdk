// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>21522202681****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2CE5821-7A18-5F7B-A18A-1C751B933D2A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponseBody self = new ModifyInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInstanceChargeTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
