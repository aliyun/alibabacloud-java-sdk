// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class AttachClusterToHubResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ManagedClusterIds")
    public java.util.List<String> managedClusterIds;

    @NameInMap("RequestId")
    public String requestId;

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
