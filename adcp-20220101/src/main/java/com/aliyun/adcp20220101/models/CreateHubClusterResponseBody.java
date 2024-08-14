// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * 
     * <strong>example:</strong>
     * <p>c09946603cd764dac96135f51d1ba****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>62F5AA2B-A2C9-5135-BCE2-C2167099****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>T-62523eda841eca071400****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateHubClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHubClusterResponseBody self = new CreateHubClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHubClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateHubClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHubClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
