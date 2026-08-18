// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteNodePoolComponentInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c846d7d529e34413c9ab1****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>EB022AB1-4CF7-5BB6-B44A-38****</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-696de321273bb00****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static DeleteNodePoolComponentInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodePoolComponentInstanceResponseBody self = new DeleteNodePoolComponentInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodePoolComponentInstanceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodePoolComponentInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNodePoolComponentInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
