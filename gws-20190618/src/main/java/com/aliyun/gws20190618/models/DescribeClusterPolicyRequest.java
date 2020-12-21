// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterPolicyRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    public static DescribeClusterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPolicyRequest self = new DescribeClusterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPolicyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterPolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    public DescribeClusterPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
