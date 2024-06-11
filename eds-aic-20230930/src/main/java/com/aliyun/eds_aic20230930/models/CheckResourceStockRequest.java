// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CheckResourceStockRequest extends TeaModel {
    @NameInMap("AcpSpecId")
    public String acpSpecId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

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

    public CheckResourceStockRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CheckResourceStockRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
