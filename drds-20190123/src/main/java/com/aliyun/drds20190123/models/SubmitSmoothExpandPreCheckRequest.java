// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckRequest extends TeaModel {
    @NameInMap("DbInstType")
    public String dbInstType;

    @NameInMap("DbName")
    public String dbName;

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
