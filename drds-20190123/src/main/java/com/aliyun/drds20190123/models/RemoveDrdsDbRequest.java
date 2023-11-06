// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsDbRequest extends TeaModel {
    /**
     * <p>The name of the database you want to back up.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the DRDS instance to which the destination database belongs.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static RemoveDrdsDbRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsDbRequest self = new RemoveDrdsDbRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsDbRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public RemoveDrdsDbRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
