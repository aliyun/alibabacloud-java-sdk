// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckConnectivityShrinkRequest extends TeaModel {
    @NameInMap("DbType")
    @Validation(required = true)
    public Integer dbType;

    @NameInMap("DbInfo")
    public String dbInfoShrink;

    public static CheckConnectivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityShrinkRequest self = new CheckConnectivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityShrinkRequest setDbType(Integer dbType) {
        this.dbType = dbType;
        return this;
    }
    public Integer getDbType() {
        return this.dbType;
    }

    public CheckConnectivityShrinkRequest setDbInfoShrink(String dbInfoShrink) {
        this.dbInfoShrink = dbInfoShrink;
        return this;
    }
    public String getDbInfoShrink() {
        return this.dbInfoShrink;
    }

}
