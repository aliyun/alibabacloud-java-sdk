// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    public static SubmitSmoothExpandPreCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckTaskRequest self = new SubmitSmoothExpandPreCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitSmoothExpandPreCheckTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
