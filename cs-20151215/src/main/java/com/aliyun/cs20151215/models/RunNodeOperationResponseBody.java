// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunNodeOperationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c2230fxxxxx</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-xxxx</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static RunNodeOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunNodeOperationResponseBody self = new RunNodeOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunNodeOperationResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunNodeOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunNodeOperationResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
