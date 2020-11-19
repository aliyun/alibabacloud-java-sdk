// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityCancelRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static SqlCompatibilityCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        SqlCompatibilityCancelRequest self = new SqlCompatibilityCancelRequest();
        return TeaModel.build(map, self);
    }

    public SqlCompatibilityCancelRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SqlCompatibilityCancelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
