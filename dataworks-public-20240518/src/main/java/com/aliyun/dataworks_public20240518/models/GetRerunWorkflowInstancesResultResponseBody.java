// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetRerunWorkflowInstancesResultResponseBody extends TeaModel {
    /**
     * <p>The request ID, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the workflow instance rerun.</p>
     */
    @NameInMap("Result")
    public GetRerunWorkflowInstancesResultResponseBodyResult result;

    public static GetRerunWorkflowInstancesResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRerunWorkflowInstancesResultResponseBody self = new GetRerunWorkflowInstancesResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRerunWorkflowInstancesResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRerunWorkflowInstancesResultResponseBody setResult(GetRerunWorkflowInstancesResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRerunWorkflowInstancesResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRerunWorkflowInstancesResultResponseBodyResult extends TeaModel {
        /**
         * <p>The failure message. Returned if the rerun fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid Param xxx</p>
         */
        @NameInMap("FailureMessage")
        public String failureMessage;

        /**
         * <p>The status. NotRun Success Failure</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetRerunWorkflowInstancesResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRerunWorkflowInstancesResultResponseBodyResult self = new GetRerunWorkflowInstancesResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRerunWorkflowInstancesResultResponseBodyResult setFailureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            return this;
        }
        public String getFailureMessage() {
            return this.failureMessage;
        }

        public GetRerunWorkflowInstancesResultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
