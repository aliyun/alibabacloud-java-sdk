// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class AttachClusterToHubResponseBody extends TeaModel {
    /**
     * <p>You can call the AttachClusterToHub operation to associate an Container Service for Kubernetes (ACK) cluster with a master instance of ACK One.</p>
     * 
     * <strong>example:</strong>
     * <p>c8e28143817db4b039b8548d7c899****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Zhishi</p>
     */
    @NameInMap("ManagedClusterIds")
    public java.util.List<String> managedClusterIds;

    /**
     * <p>Example 1</p>
     * 
     * <strong>example:</strong>
     * <p>EA06613B-37A3-549E-BAE0-E4AD8A6E93D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-623a96b7bbeaac074b00****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static AttachClusterToHubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachClusterToHubResponseBody self = new AttachClusterToHubResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachClusterToHubResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachClusterToHubResponseBody setManagedClusterIds(java.util.List<String> managedClusterIds) {
        this.managedClusterIds = managedClusterIds;
        return this;
    }
    public java.util.List<String> getManagedClusterIds() {
        return this.managedClusterIds;
    }

    public AttachClusterToHubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachClusterToHubResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
