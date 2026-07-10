// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static FlightOrderDetailV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailV2Request self = new FlightOrderDetailV2Request();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightOrderDetailV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightOrderDetailV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
