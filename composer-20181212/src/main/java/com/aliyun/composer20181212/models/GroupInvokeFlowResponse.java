// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GroupInvocationId")
    @Validation(required = true)
    public String groupInvocationId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("CurrentCount")
    @Validation(required = true)
    public Integer currentCount;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static GroupInvokeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GroupInvokeFlowResponse self = new GroupInvokeFlowResponse();
        return TeaModel.build(map, self);
    }

    public GroupInvokeFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GroupInvokeFlowResponse setGroupInvocationId(String groupInvocationId) {
        this.groupInvocationId = groupInvocationId;
        return this;
    }
    public String getGroupInvocationId() {
        return this.groupInvocationId;
    }

    public GroupInvokeFlowResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GroupInvokeFlowResponse setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public GroupInvokeFlowResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
