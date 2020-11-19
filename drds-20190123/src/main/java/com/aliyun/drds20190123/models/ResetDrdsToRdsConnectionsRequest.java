// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ResetDrdsToRdsConnectionsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    public static ResetDrdsToRdsConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDrdsToRdsConnectionsRequest self = new ResetDrdsToRdsConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ResetDrdsToRdsConnectionsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ResetDrdsToRdsConnectionsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
