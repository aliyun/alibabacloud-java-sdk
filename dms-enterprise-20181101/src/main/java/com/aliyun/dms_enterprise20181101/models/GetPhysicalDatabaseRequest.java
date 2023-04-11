// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseRequest extends TeaModel {
    /**
     * <p>The ID of the physical database. You can call the [SearchDatabase](~~141876~~) operation to obtain the ID.</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetPhysicalDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalDatabaseRequest self = new GetPhysicalDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetPhysicalDatabaseRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public GetPhysicalDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
