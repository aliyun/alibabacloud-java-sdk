// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaItemDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cheshi</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68cdc6b37c87484c98b479b49306ffbb_0</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static FlightOtaItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaItemDetailRequest self = new FlightOtaItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public FlightOtaItemDetailRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightOtaItemDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightOtaItemDetailRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public FlightOtaItemDetailRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
