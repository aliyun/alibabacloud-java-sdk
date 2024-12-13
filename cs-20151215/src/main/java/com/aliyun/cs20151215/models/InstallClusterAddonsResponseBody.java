// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48BD70F6-A7E6-543D-9F23-08DEB764C92E</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>T-5a54309c80282e39ea00002f</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static InstallClusterAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsResponseBody self = new InstallClusterAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallClusterAddonsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallClusterAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallClusterAddonsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
