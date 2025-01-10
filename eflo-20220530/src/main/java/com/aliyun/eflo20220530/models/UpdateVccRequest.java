// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVccRequest extends TeaModel {
    /**
     * <p>The peak bandwidth of the Lingjun connection instance. Unit: Mbit/s. Valid values: 1000 to 400000</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the order placed on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20006627643</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Lingjun connection instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>The name of the Lingjun connection instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-heyuan-backup</p>
     */
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
