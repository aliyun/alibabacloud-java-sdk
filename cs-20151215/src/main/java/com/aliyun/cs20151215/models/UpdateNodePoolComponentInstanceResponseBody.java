// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateNodePoolComponentInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c2230fxxxxx</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-xxxx</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static UpdateNodePoolComponentInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodePoolComponentInstanceResponseBody self = new UpdateNodePoolComponentInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodePoolComponentInstanceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateNodePoolComponentInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodePoolComponentInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
