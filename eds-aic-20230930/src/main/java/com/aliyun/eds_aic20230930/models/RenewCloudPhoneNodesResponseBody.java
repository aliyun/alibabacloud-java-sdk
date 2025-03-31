// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewCloudPhoneNodesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>22365781890****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewCloudPhoneNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewCloudPhoneNodesResponseBody self = new RenewCloudPhoneNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewCloudPhoneNodesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewCloudPhoneNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
