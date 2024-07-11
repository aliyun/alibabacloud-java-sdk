// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterAuditLogConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c93095129fc41463aa455d89444fd****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>48BD70F6-A7E6-543D-9F23-08DEB764C92E</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-5faa48fb31b6b8078d00****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static UpdateClusterAuditLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAuditLogConfigResponseBody self = new UpdateClusterAuditLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAuditLogConfigResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterAuditLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateClusterAuditLogConfigResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
