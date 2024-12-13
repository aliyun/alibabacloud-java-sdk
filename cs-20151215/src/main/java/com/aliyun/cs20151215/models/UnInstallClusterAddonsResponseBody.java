// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsResponseBody extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>任务ID。</p>
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
