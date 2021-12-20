// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CloseOrderRequest extends TeaModel {
    @NameInMap("CloseReason")
    public String closeReason;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

    public static CloseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseOrderRequest self = new CloseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CloseOrderRequest setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }
    public String getCloseReason() {
        return this.closeReason;
    }

    public CloseOrderRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CloseOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloseOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
