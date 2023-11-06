// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckDrdsDbNameRequest extends TeaModel {
    /**
     * <p>DRDS database name</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>DRDS instance ID</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static CheckDrdsDbNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDrdsDbNameRequest self = new CheckDrdsDbNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckDrdsDbNameRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CheckDrdsDbNameRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
