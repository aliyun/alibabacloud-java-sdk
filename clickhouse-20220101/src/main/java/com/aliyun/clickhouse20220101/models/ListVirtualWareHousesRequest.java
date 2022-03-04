// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHousesRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListVirtualWareHousesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualWareHousesRequest self = new ListVirtualWareHousesRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualWareHousesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListVirtualWareHousesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
