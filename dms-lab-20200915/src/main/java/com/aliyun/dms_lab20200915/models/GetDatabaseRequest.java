// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    @NameInMap("Uid")
    @Validation(required = true)
    public String uid;

    @NameInMap("DbType")
    @Validation(required = true)
    public String dbType;

    public static GetDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseRequest self = new GetDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

}
