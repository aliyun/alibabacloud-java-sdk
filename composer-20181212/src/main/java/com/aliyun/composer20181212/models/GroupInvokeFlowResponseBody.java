// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowResponseBody extends TeaModel {
    // 当前批次
    @NameInMap("CurrentCount")
    public Integer currentCount;

    // 执行 ID
    @NameInMap("GroupInvocationId")
    public String groupInvocationId;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 状态
    @NameInMap("Status")
    public String status;

    // 调用是否成功
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
