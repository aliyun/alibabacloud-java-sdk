// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLogicTableRouteConfigRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RouteExpr")
    public String routeExpr;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("RouteKey")
    public String routeKey;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the tenant ID.</p>
     */
    @NameInMap("TableId")
    public Long tableId;

    /**
     * <p>Adds a routing algorithm to a logical table.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static AddLogicTableRouteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLogicTableRouteConfigRequest self = new AddLogicTableRouteConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLogicTableRouteConfigRequest setRouteExpr(String routeExpr) {
        this.routeExpr = routeExpr;
        return this;
    }
    public String getRouteExpr() {
        return this.routeExpr;
    }

    public AddLogicTableRouteConfigRequest setRouteKey(String routeKey) {
        this.routeKey = routeKey;
        return this;
    }
    public String getRouteKey() {
        return this.routeKey;
    }

    public AddLogicTableRouteConfigRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

    public AddLogicTableRouteConfigRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
