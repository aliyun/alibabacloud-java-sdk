// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyPayV2ShrinkRequest extends TeaModel {
    @NameInMap("ext_params")
    public String extParamsShrink;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("modify_pay_amount")
    public Long modifyPayAmount;

    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    @NameInMap("sub_order_id")
    public Long subOrderId;

    public static FlightModifyPayV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyPayV2ShrinkRequest self = new FlightModifyPayV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightModifyPayV2ShrinkRequest setExtParamsShrink(String extParamsShrink) {
        this.extParamsShrink = extParamsShrink;
        return this;
    }
    public String getExtParamsShrink() {
        return this.extParamsShrink;
    }

    public FlightModifyPayV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyPayV2ShrinkRequest setModifyPayAmount(Long modifyPayAmount) {
        this.modifyPayAmount = modifyPayAmount;
        return this;
    }
    public Long getModifyPayAmount() {
        return this.modifyPayAmount;
    }

    public FlightModifyPayV2ShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyPayV2ShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyPayV2ShrinkRequest setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public FlightModifyPayV2ShrinkRequest setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
        return this;
    }
    public Long getSubOrderId() {
        return this.subOrderId;
    }

}
