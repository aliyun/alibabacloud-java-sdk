// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLorneTaskStatusRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("LorneStatus")
    @Validation(required = true)
    public String lorneStatus;

    public static OperateLorneTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateLorneTaskStatusRequest self = new OperateLorneTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public OperateLorneTaskStatusRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public OperateLorneTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OperateLorneTaskStatusRequest setLorneStatus(String lorneStatus) {
        this.lorneStatus = lorneStatus;
        return this;
    }
    public String getLorneStatus() {
        return this.lorneStatus;
    }

}
