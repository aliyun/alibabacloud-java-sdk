// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>74D1512F-67DA-54E8-99EA-4D50EB4898F4</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-66e39b39c0fdd001320005c0</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static UnInstallClusterAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsResponseBody self = new UnInstallClusterAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public UnInstallClusterAddonsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnInstallClusterAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnInstallClusterAddonsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
