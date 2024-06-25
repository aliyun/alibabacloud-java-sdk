// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cb95aa626a47740afbf6aa09****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>687C5BAA-D103-4993-884B-C35E4314****</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-5a54309c80282e39ea00****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static ModifyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterResponseBody self = new ModifyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
