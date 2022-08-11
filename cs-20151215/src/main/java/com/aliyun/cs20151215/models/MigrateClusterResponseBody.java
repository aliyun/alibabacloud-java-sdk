// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MigrateClusterResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("request_id")
    public String requestId;

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
