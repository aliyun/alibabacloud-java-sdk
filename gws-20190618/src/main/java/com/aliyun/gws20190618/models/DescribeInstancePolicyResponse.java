// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeInstancePolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VisualLossless")
    @Validation(required = true)
    public String visualLossless;

    @NameInMap("OptimizeFor3d")
    @Validation(required = true)
    public String optimizeFor3d;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TaskFinished")
    @Validation(required = true)
    public Boolean taskFinished;

    public static DescribeInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePolicyResponse self = new DescribeInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancePolicyResponse setVisualLossless(String visualLossless) {
        this.visualLossless = visualLossless;
        return this;
    }
    public String getVisualLossless() {
        return this.visualLossless;
    }

    public DescribeInstancePolicyResponse setOptimizeFor3d(String optimizeFor3d) {
        this.optimizeFor3d = optimizeFor3d;
        return this;
    }
    public String getOptimizeFor3d() {
        return this.optimizeFor3d;
    }

    public DescribeInstancePolicyResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeInstancePolicyResponse setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

}
