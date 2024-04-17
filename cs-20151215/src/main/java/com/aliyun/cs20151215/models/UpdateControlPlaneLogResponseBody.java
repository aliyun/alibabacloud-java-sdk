// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static UpdateControlPlaneLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogResponseBody self = new UpdateControlPlaneLogResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateControlPlaneLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateControlPlaneLogResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
