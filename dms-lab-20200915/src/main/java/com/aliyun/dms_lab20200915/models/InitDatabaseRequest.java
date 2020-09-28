// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class InitDatabaseRequest extends TeaModel {
    @NameInMap("Uid")
    @Validation(required = true)
    public String uid;

    @NameInMap("Date")
    public String date;

    @NameInMap("DbType")
    @Validation(required = true)
    public String dbType;

    @NameInMap("DbName")
    public String dbName;

    public static InitDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDatabaseRequest self = new InitDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public InitDatabaseRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public InitDatabaseRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public InitDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public InitDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
