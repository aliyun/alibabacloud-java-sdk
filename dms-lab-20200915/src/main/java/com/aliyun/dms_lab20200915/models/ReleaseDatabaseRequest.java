// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class ReleaseDatabaseRequest extends TeaModel {
    @NameInMap("Uid")
    @Validation(required = true)
    public String uid;

    @NameInMap("Date")
    public String date;

    @NameInMap("DbType")
    @Validation(required = true)
    public String dbType;

    public static ReleaseDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDatabaseRequest self = new ReleaseDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseDatabaseRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ReleaseDatabaseRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ReleaseDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

}
