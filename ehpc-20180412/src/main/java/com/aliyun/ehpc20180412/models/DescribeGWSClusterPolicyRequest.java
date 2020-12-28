// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClusterPolicyRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    public static DescribeGWSClusterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClusterPolicyRequest self = new DescribeGWSClusterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClusterPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeGWSClusterPolicyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeGWSClusterPolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

}
