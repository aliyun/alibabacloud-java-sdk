// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowCategoryResponseBody extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteFlowCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowCategoryResponseBody self = new DeleteFlowCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowCategoryResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DeleteFlowCategoryResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteFlowCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowCategoryResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
