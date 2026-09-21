// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateDDoSSpecResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-ddos-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31223****11</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDDoSSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDDoSSpecResponseBody self = new UpdateDDoSSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDDoSSpecResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDDoSSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateDDoSSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
