// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ReleaseVirtualWareHousePublicConnectionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static ReleaseVirtualWareHousePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseVirtualWareHousePublicConnectionRequest self = new ReleaseVirtualWareHousePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseVirtualWareHousePublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ReleaseVirtualWareHousePublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseVirtualWareHousePublicConnectionRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
