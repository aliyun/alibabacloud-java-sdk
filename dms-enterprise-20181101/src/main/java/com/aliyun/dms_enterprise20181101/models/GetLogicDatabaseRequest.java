// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseRequest extends TeaModel {
    /**
     * <p>The ID of the logical database. You can call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation to obtain the ID of the logical database.</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogicDatabaseRequest self = new GetLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLogicDatabaseRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public GetLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
