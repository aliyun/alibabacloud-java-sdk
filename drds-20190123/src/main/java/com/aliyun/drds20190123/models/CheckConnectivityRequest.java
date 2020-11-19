// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckConnectivityRequest extends TeaModel {
    @NameInMap("DbType")
    @Validation(required = true)
    public Integer dbType;

    @NameInMap("DbInfo")
    public java.util.Map<String, ?> dbInfo;

    public static CheckConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityRequest self = new CheckConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityRequest setDbType(Integer dbType) {
        this.dbType = dbType;
        return this;
    }
    public Integer getDbType() {
        return this.dbType;
    }

    public CheckConnectivityRequest setDbInfo(java.util.Map<String, ?> dbInfo) {
        this.dbInfo = dbInfo;
        return this;
    }
    public java.util.Map<String, ?> getDbInfo() {
        return this.dbInfo;
    }

}
