// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLogicTableRouteConfigRequest extends TeaModel {
    @NameInMap("RouteKey")
    public String routeKey;

    @NameInMap("TableId")
    public Long tableId;

    @NameInMap("Tid")
    public Long tid;

    public static DeleteLogicTableRouteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicTableRouteConfigRequest self = new DeleteLogicTableRouteConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogicTableRouteConfigRequest setRouteKey(String routeKey) {
        this.routeKey = routeKey;
        return this;
    }
    public String getRouteKey() {
        return this.routeKey;
    }

    public DeleteLogicTableRouteConfigRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

    public DeleteLogicTableRouteConfigRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
