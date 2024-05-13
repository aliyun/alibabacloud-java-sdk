// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTopologyRequest extends TeaModel {
    /**
     * <p>The ID of the logical database. You can call the [ListLogicDatabases](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogicdatabases) or [SearchDatabase](https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase) operation to query the ID of the logical database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogicDbId")
    public Long logicDbId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDBTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDBTopologyRequest self = new GetDBTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetDBTopologyRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public GetDBTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
