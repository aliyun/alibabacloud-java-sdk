// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLogicTableRouteConfigRequest extends TeaModel {
    /**
     * <p>The routing algorithm expression. For more information about how to configure a routing algorithm expression, see [Configure a routing algorithm](https://www.alibabacloud.com/help/en/data-management-service/latest/configure-a-routing-algorithm).</p>
     */
    @NameInMap("RouteExpr")
    public String routeExpr;

    /**
     * <p>The unique key of the routing algorithm. </p>
     * <br>
     * <p>> - You can create a custom unique key for the routing algorithm. No requirements are imposed on custom unique keys.</p>
     * <p>> - The unique key of the routing algorithm in the same logical table must be unique.</p>
     */
    @NameInMap("RouteKey")
    public String routeKey;

    /**
     * <p>The ID of the logical table. You can call the [ListLogicTables](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictables) operation to query the ID of the logical table.</p>
     */
    @NameInMap("TableId")
    public Long tableId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the tenant ID.</p>
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
