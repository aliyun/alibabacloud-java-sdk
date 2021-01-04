// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("DbId")
    public String dbId;

    public static GetLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogicDatabaseRequest self = new GetLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetLogicDatabaseRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

}
