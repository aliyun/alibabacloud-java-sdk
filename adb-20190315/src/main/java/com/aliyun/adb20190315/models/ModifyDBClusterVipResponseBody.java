// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterVipResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-****-4A42-BF6D-8A4442913CEF</p>
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
    public String taskId;

    public static ModifyDBClusterVipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterVipResponseBody self = new ModifyDBClusterVipResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterVipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBClusterVipResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
