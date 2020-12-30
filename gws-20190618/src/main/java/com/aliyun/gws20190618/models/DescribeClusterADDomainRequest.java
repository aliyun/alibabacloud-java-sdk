// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterADDomainRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeClusterADDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterADDomainRequest self = new DescribeClusterADDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterADDomainRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterADDomainRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
