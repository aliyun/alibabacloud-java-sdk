// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTableRouteConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TableId")
    public Long tableId;

    @NameInMap("Tid")
    public Long tid;

    public static ListLogicTableRouteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTableRouteConfigRequest self = new ListLogicTableRouteConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListLogicTableRouteConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLogicTableRouteConfigRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

    public ListLogicTableRouteConfigRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
