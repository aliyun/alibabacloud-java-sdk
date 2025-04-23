// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateHybridClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F6757FA4-8FED-4602-B7F5-3550C0842122</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>F6757FA4-8FED-4602-B7F5-3550C0842122</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateHybridClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridClusterResponseBody self = new CreateHybridClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHybridClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateHybridClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHybridClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
