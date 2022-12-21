// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTableRouteConfigRequest extends TeaModel {
    // The ID of the logical table. You can call the [ListLogicTables](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictables) operation to query the ID of the logical table.
    @NameInMap("TableId")
    public Long tableId;

    // The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListLogicTableRouteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTableRouteConfigRequest self = new ListLogicTableRouteConfigRequest();
        return TeaModel.build(map, self);
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
