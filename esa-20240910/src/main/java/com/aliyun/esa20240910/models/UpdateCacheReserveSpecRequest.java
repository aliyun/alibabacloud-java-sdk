// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheReserveSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>esa-cr-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TargetQuotaGb")
    public Long targetQuotaGb;

    public static UpdateCacheReserveSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheReserveSpecRequest self = new UpdateCacheReserveSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCacheReserveSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpdateCacheReserveSpecRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public UpdateCacheReserveSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCacheReserveSpecRequest setTargetQuotaGb(Long targetQuotaGb) {
        this.targetQuotaGb = targetQuotaGb;
        return this;
    }
    public Long getTargetQuotaGb() {
        return this.targetQuotaGb;
    }

}
