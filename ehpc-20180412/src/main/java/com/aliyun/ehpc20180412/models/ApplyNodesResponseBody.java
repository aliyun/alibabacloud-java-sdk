// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SatisfiedAmount")
    public Integer satisfiedAmount;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("Detail")
    public String detail;

    public static ApplyNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyNodesResponseBody self = new ApplyNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ApplyNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyNodesResponseBody setSatisfiedAmount(Integer satisfiedAmount) {
        this.satisfiedAmount = satisfiedAmount;
        return this;
    }
    public Integer getSatisfiedAmount() {
        return this.satisfiedAmount;
    }

    public ApplyNodesResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ApplyNodesResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

}
