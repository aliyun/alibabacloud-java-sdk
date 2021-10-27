// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckSqlAuditEnableStatusRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static CheckSqlAuditEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditEnableStatusRequest self = new CheckSqlAuditEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditEnableStatusRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CheckSqlAuditEnableStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
