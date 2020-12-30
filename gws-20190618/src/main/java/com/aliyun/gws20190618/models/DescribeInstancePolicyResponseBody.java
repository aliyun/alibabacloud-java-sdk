// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeInstancePolicyResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskFinished")
    public Boolean taskFinished;

    @NameInMap("VisualLossless")
    public String visualLossless;

    @NameInMap("OptimizeFor3d")
    public String optimizeFor3d;

    public static DescribeInstancePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePolicyResponseBody self = new DescribeInstancePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePolicyResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeInstancePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancePolicyResponseBody setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    public DescribeInstancePolicyResponseBody setVisualLossless(String visualLossless) {
        this.visualLossless = visualLossless;
        return this;
    }
    public String getVisualLossless() {
        return this.visualLossless;
    }

    public DescribeInstancePolicyResponseBody setOptimizeFor3d(String optimizeFor3d) {
        this.optimizeFor3d = optimizeFor3d;
        return this;
    }
    public String getOptimizeFor3d() {
        return this.optimizeFor3d;
    }

}
