// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyRequest extends TeaModel {
    /**
     * <p>The GUID of the table in Data Management (DMS).</p>
     * <br>
     * <p>> </p>
     * <p>> - You can call the [ListLogicTables](https://help.aliyun.com/document_detail/141875.html) operation with ReturnGuid set to true to query the GUIDs of logical tables in a specific logical database.</p>
     * <p>> - You can call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation with ReturnGuid set to true to query the GUIDs of tables in a specific physical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the "View information about the current tenant" section of the [Tenant information](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetTableTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableTopologyRequest self = new GetTableTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetTableTopologyRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetTableTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
