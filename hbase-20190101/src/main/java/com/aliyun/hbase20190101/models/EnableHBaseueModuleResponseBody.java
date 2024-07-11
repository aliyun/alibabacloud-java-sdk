// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****-m1-ps</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>21474915573****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>407075EA-47F5-5A2D-888F-C1F90B8F3FCA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableHBaseueModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueModuleResponseBody self = new EnableHBaseueModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueModuleResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public EnableHBaseueModuleResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public EnableHBaseueModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
