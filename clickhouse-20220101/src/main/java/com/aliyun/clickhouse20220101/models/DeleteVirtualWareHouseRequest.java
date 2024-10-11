// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteVirtualWareHouseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc-bp1qx68m06981****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vw-bp1w2728d535t****</p>
     */
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static DeleteVirtualWareHouseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualWareHouseRequest self = new DeleteVirtualWareHouseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualWareHouseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteVirtualWareHouseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVirtualWareHouseRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
