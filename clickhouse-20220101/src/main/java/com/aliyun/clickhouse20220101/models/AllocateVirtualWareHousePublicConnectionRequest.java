// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class AllocateVirtualWareHousePublicConnectionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static AllocateVirtualWareHousePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateVirtualWareHousePublicConnectionRequest self = new AllocateVirtualWareHousePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateVirtualWareHousePublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AllocateVirtualWareHousePublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateVirtualWareHousePublicConnectionRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
