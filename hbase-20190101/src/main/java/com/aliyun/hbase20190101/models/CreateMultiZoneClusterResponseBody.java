// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateMultiZoneClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ld-t4nn71xa0yn56****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>23232453****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>7F68E8F5-0377-4CF8-8B1D-FFFD6F5804D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMultiZoneClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiZoneClusterResponseBody self = new CreateMultiZoneClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultiZoneClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateMultiZoneClusterResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateMultiZoneClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
