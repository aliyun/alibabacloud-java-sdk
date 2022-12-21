// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnRequest extends TeaModel {
    // The globally unique identifier (GUID) of the table in Data Management (DMS).
    // 
    // *   If the database to which the table belongs is a logical database, you can call the [ListLogicTables](~~141875~~) operation to obtain the value of this parameter.
    // *   If the database to which the table belongs is a physical database, you can call the [ListTables](~~141878~~) operation to obtain the value of this parameter.
    @NameInMap("TableGuid")
    public String tableGuid;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static GetMetaTableColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnRequest self = new GetMetaTableColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableColumnRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
