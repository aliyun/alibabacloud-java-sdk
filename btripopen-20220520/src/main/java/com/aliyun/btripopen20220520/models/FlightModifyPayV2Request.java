// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyPayV2Request extends TeaModel {
    @NameInMap("ext_params")
    public java.util.Map<String, ?> extParams;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>5100</p>
     */
    @NameInMap("modify_pay_amount")
    public Long modifyPayAmount;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467200</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467200</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>1019195786853020</p>
     */
    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    /**
     * <strong>example:</strong>
     * <p>1019195786853020</p>
     */
    @NameInMap("sub_order_id")
    public Long subOrderId;

    public static FlightModifyPayV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyPayV2Request self = new FlightModifyPayV2Request();
        return TeaModel.build(map, self);
    }

    public FlightModifyPayV2Request setExtParams(java.util.Map<String, ?> extParams) {
        this.extParams = extParams;
        return this;
    }
    public java.util.Map<String, ?> getExtParams() {
        return this.extParams;
    }

    public FlightModifyPayV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyPayV2Request setModifyPayAmount(Long modifyPayAmount) {
        this.modifyPayAmount = modifyPayAmount;
        return this;
    }
    public Long getModifyPayAmount() {
        return this.modifyPayAmount;
    }

    public FlightModifyPayV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyPayV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyPayV2Request setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public FlightModifyPayV2Request setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
        return this;
    }
    public Long getSubOrderId() {
        return this.subOrderId;
    }

}
