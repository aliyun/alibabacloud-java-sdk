// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVccRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VccId")
    public String vccId;

    @NameInMap("VccName")
    public String vccName;

    public static UpdateVccRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVccRequest self = new UpdateVccRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVccRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateVccRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateVccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVccRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public UpdateVccRequest setVccName(String vccName) {
        this.vccName = vccName;
        return this;
    }
    public String getVccName() {
        return this.vccName;
    }

}
