// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyCancelV2Request extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    @NameInMap("sub_order_id")
    public Long subOrderId;

    public static FlightModifyCancelV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyCancelV2Request self = new FlightModifyCancelV2Request();
        return TeaModel.build(map, self);
    }

    public FlightModifyCancelV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyCancelV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyCancelV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyCancelV2Request setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public FlightModifyCancelV2Request setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
        return this;
    }
    public Long getSubOrderId() {
        return this.subOrderId;
    }

}
