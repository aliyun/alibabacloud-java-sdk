// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsDbFailedRecordRequest extends TeaModel {
    /**
     * <p>The name of the DRDS database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the ApsaraDB RDS for PostgreSQL instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static RemoveDrdsDbFailedRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsDbFailedRecordRequest self = new RemoveDrdsDbFailedRecordRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsDbFailedRecordRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public RemoveDrdsDbFailedRecordRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
