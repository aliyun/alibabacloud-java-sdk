// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SyncDatabaseMetaRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("DbId")
    public String dbId;

    @NameInMap("Logic")
    public Boolean logic;

    public static SyncDatabaseMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDatabaseMetaRequest self = new SyncDatabaseMetaRequest();
        return TeaModel.build(map, self);
    }

    public SyncDatabaseMetaRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public SyncDatabaseMetaRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public SyncDatabaseMetaRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

}
