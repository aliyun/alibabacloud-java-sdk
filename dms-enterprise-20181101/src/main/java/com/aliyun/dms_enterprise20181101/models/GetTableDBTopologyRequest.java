// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDBTopologyRequest extends TeaModel {
    /**
     * <p>The GUID of the table in DMS.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the database to which the table belongs is a logical database, you can call the [ListLogicTables](https://help.aliyun.com/document_detail/141875.html) operation to obtain the GUID. The value of the ReturnGuid parameter must be set to true.</p>
     * <br>
     * <p>*   If the database to which the table belongs is a physical database, you can call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation to obtain the GUID. The value of the ReturnGuid parameter must be set to true.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetTableDBTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableDBTopologyRequest self = new GetTableDBTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetTableDBTopologyRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetTableDBTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
