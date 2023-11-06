// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckRequest extends TeaModel {
    /**
     * <p>The type of the database. Valid values:</p>
     * <br>
     * <p>*   RDS</p>
     * <p>*   POLARDB</p>
     */
    @NameInMap("DbInstType")
    public String dbInstType;

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

    public static SubmitSmoothExpandPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckRequest self = new SubmitSmoothExpandPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public SubmitSmoothExpandPreCheckRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSmoothExpandPreCheckRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
