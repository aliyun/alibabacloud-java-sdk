// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DisableSqlAuditRequest extends TeaModel {
    /**
     * <p>The name of the database for which you want to disable the SQL audit feature.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DisableSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlAuditRequest self = new DisableSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public DisableSqlAuditRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DisableSqlAuditRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
