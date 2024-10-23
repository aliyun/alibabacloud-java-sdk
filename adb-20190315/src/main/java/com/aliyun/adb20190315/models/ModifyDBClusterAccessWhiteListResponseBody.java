// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1564657730</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static ModifyDBClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListResponseBody self = new ModifyDBClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBClusterAccessWhiteListResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
