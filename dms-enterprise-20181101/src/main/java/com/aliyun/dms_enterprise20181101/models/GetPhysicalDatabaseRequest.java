// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseRequest extends TeaModel {
    /**
     * <p>The ID of the physical database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43153</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
