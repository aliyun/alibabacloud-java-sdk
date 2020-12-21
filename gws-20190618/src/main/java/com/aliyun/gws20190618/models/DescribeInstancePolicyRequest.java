// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeInstancePolicyRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    public static DescribeInstancePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePolicyRequest self = new DescribeInstancePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancePolicyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeInstancePolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

}
