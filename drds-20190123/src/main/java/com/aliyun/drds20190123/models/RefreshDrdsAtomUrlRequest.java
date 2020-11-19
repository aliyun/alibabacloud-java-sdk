// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RefreshDrdsAtomUrlRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    public static RefreshDrdsAtomUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDrdsAtomUrlRequest self = new RefreshDrdsAtomUrlRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDrdsAtomUrlRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public RefreshDrdsAtomUrlRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
