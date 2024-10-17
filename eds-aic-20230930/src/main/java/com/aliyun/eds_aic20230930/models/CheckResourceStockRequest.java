// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CheckResourceStockRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acp.basic.small</p>
     */
    @NameInMap("AcpSpecId")
    public String acpSpecId;

    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("GpuAcceleration")
    public Boolean gpuAcceleration;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CheckResourceStockRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceStockRequest self = new CheckResourceStockRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceStockRequest setAcpSpecId(String acpSpecId) {
        this.acpSpecId = acpSpecId;
        return this;
    }
    public String getAcpSpecId() {
        return this.acpSpecId;
    }

    public CheckResourceStockRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CheckResourceStockRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CheckResourceStockRequest setGpuAcceleration(Boolean gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public Boolean getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public CheckResourceStockRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
