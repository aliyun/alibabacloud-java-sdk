// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i116913051663373010974</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>3C683243-7915-57FB-9570-A2932C1C0F78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Task Id</p>
     * 
     * <strong>example:</strong>
     * <p>i159809891662373011015</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
