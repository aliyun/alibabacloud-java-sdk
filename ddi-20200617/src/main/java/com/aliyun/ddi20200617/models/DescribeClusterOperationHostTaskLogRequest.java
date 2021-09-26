// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeClusterOperationHostTaskLogRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Status")
    public String status;

    public static DescribeClusterOperationHostTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterOperationHostTaskLogRequest self = new DescribeClusterOperationHostTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterOperationHostTaskLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClusterOperationHostTaskLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterOperationHostTaskLogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterOperationHostTaskLogRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public DescribeClusterOperationHostTaskLogRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public DescribeClusterOperationHostTaskLogRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterOperationHostTaskLogRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
