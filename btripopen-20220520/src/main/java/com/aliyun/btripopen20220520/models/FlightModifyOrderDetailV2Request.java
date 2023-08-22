// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOrderDetailV2Request extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("modify_apply_id")
    public String modifyApplyId;

    @NameInMap("need_query_service_fee")
    public Boolean needQueryServiceFee;

    @NameInMap("order_id")
    public String orderId;

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

}
