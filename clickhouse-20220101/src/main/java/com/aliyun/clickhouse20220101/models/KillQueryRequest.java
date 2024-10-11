// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class KillQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc-bp1qx68m06981****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>21152382576****</p>
     */
    @NameInMap("QueryIds")
    public String queryIds;

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
     * <p>vw-uf62965t8lt50****</p>
     */
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static KillQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        KillQueryRequest self = new KillQueryRequest();
        return TeaModel.build(map, self);
    }

    public KillQueryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public KillQueryRequest setQueryIds(String queryIds) {
        this.queryIds = queryIds;
        return this;
    }
    public String getQueryIds() {
        return this.queryIds;
    }

    public KillQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KillQueryRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
