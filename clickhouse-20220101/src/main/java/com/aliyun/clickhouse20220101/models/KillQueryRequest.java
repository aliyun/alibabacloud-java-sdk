// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class KillQueryRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 指定查询ID列表 英文逗号分隔 不指定则匹配所有查询
    @NameInMap("QueryIds")
    public String queryIds;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组ID
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
