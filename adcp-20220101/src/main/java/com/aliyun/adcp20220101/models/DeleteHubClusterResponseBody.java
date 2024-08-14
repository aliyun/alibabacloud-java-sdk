// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cb09fda0dc2f94a8397c76638c7ec****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7A827E32-6D24-5757-B3FD-D9396495FBDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>T-623a96b7bbeaac074b00****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteHubClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHubClusterResponseBody self = new DeleteHubClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHubClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHubClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHubClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
