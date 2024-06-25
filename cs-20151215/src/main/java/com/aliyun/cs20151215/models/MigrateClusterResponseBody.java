// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MigrateClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c8155823d057948c69a****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>T-62ccd14aacb8db06ca00****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static MigrateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateClusterResponseBody self = new MigrateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public MigrateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
