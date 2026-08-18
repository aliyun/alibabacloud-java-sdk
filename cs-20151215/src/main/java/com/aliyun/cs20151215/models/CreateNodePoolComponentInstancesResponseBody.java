// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateNodePoolComponentInstancesResponseBody extends TeaModel {
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

    public static CreateNodePoolComponentInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodePoolComponentInstancesResponseBody self = new CreateNodePoolComponentInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodePoolComponentInstancesResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodePoolComponentInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNodePoolComponentInstancesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
