// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowResponseBody extends TeaModel {
    // The number of times of execution that are pending.
    @NameInMap("CurrentCount")
    public Integer currentCount;

    // The unique identifier of the execution.
    @NameInMap("GroupInvocationId")
    public String groupInvocationId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The status of the group. Valid values:
    // 
    // *   New: The group is created and waiting to be executed.
    // *   Started: The group is being executed.
    // *   Canceled: The group was canceled.
    // *   Failed: The execution failed.
    // *   Completed: All the times of execution in the group are complete.
    // *   Unknown: The group status is uncertain. In this case, a system error may occur.
    // *   TimedOut: The execution timed out.
    // *   Paused: The execution was suspended.
    @NameInMap("Status")
    public String status;

    // Indicates whether the operation was successful.
    // 
    // *   **true**: The workflow execution is triggered.
    // *   **false**: The workflow execution failed to be triggered.
    // 
    // > : You can call the **GetInvocationLog** operation to check whether the workflow execution is successful.
    @NameInMap("Success")
    public Boolean success;

    public static GroupInvokeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GroupInvokeFlowResponseBody self = new GroupInvokeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GroupInvokeFlowResponseBody setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public GroupInvokeFlowResponseBody setGroupInvocationId(String groupInvocationId) {
        this.groupInvocationId = groupInvocationId;
        return this;
    }
    public String getGroupInvocationId() {
        return this.groupInvocationId;
    }

    public GroupInvokeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GroupInvokeFlowResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GroupInvokeFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
