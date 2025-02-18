// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCreateWorkflowInstancesResultResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of asynchronously creating a workflow instance.</p>
     */
    @NameInMap("Result")
    public GetCreateWorkflowInstancesResultResponseBodyResult result;

    public static GetCreateWorkflowInstancesResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreateWorkflowInstancesResultResponseBody self = new GetCreateWorkflowInstancesResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreateWorkflowInstancesResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreateWorkflowInstancesResultResponseBody setResult(GetCreateWorkflowInstancesResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCreateWorkflowInstancesResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetCreateWorkflowInstancesResultResponseBodyResult extends TeaModel {
        /**
         * <p>The error message. This parameter is returned only if the creation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid Param xxx</p>
         */
        @NameInMap("FailureMessage")
        public String failureMessage;

        /**
         * <p>The creation status. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Created</li>
         * <li>CreateFailure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workflow instance IDs. This parameter is returned only if the creation is successful.</p>
         */
        @NameInMap("WorkflowInstanceIds")
        public java.util.List<Long> workflowInstanceIds;

        public static GetCreateWorkflowInstancesResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCreateWorkflowInstancesResultResponseBodyResult self = new GetCreateWorkflowInstancesResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCreateWorkflowInstancesResultResponseBodyResult setFailureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            return this;
        }
        public String getFailureMessage() {
            return this.failureMessage;
        }

        public GetCreateWorkflowInstancesResultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCreateWorkflowInstancesResultResponseBodyResult setWorkflowInstanceIds(java.util.List<Long> workflowInstanceIds) {
            this.workflowInstanceIds = workflowInstanceIds;
            return this;
        }
        public java.util.List<Long> getWorkflowInstanceIds() {
            return this.workflowInstanceIds;
        }

    }

}
