// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckExpandStatusRequest extends TeaModel {
    /**
     * <p>The name of the PolarDB-X database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static CheckExpandStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckExpandStatusRequest self = new CheckExpandStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckExpandStatusRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CheckExpandStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
