// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOrderDetailV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>1019195786853020</p>
     */
    @NameInMap("modify_apply_id")
    public String modifyApplyId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("need_query_service_fee")
    public Boolean needQueryServiceFee;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467200</p>
     */
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_modify_apply_id")
    public String outModifyApplyId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static FlightModifyOrderDetailV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOrderDetailV2Request self = new FlightModifyOrderDetailV2Request();
        return TeaModel.build(map, self);
    }

    public FlightModifyOrderDetailV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyOrderDetailV2Request setModifyApplyId(String modifyApplyId) {
        this.modifyApplyId = modifyApplyId;
        return this;
    }
    public String getModifyApplyId() {
        return this.modifyApplyId;
    }

    public FlightModifyOrderDetailV2Request setNeedQueryServiceFee(Boolean needQueryServiceFee) {
        this.needQueryServiceFee = needQueryServiceFee;
        return this;
    }
    public Boolean getNeedQueryServiceFee() {
        return this.needQueryServiceFee;
    }

    public FlightModifyOrderDetailV2Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightModifyOrderDetailV2Request setOutModifyApplyId(String outModifyApplyId) {
        this.outModifyApplyId = outModifyApplyId;
        return this;
    }
    public String getOutModifyApplyId() {
        return this.outModifyApplyId;
    }

    public FlightModifyOrderDetailV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
