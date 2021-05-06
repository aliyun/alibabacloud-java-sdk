// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ModifyDBClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListResponseBody self = new ModifyDBClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public ModifyDBClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBClusterAccessWhiteListResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
