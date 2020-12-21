// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionsRequest extends TeaModel {
    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeClusterConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionsRequest self = new DescribeClusterConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterConnectionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeClusterConnectionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeClusterConnectionsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
