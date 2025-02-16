// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRatePlanSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xcdn-as23ds***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>2223332122***</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>30423A7F-A83D-1E24-B80E-86DD25790758</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRatePlanSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRatePlanSpecResponseBody self = new UpdateRatePlanSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRatePlanSpecResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRatePlanSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateRatePlanSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
