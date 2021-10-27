// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowResponseBody extends TeaModel {
    @NameInMap("CurrentCount")
    public Integer currentCount;

    @NameInMap("GroupInvocationId")
    public String groupInvocationId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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
