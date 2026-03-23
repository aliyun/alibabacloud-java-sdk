// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackExecutionResultResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2D40488-3F74-568B-87EC-1C04D098DF8B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("stackResults")
    public java.util.List<GetStackExecutionResultResponseBodyStackResults> stackResults;

    /**
     * <strong>example:</strong>
     * <p>event-xxx</p>
     */
    @NameInMap("triggerId")
    public String triggerId;

    @NameInMap("triggeredStatus")
    public String triggeredStatus;

    public static GetStackExecutionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackExecutionResultResponseBody self = new GetStackExecutionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackExecutionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackExecutionResultResponseBody setStackResults(java.util.List<GetStackExecutionResultResponseBodyStackResults> stackResults) {
        this.stackResults = stackResults;
        return this;
    }
    public java.util.List<GetStackExecutionResultResponseBodyStackResults> getStackResults() {
        return this.stackResults;
    }

    public GetStackExecutionResultResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public GetStackExecutionResultResponseBody setTriggeredStatus(String triggeredStatus) {
        this.triggeredStatus = triggeredStatus;
        return this;
    }
    public String getTriggeredStatus() {
        return this.triggeredStatus;
    }

    public static class GetStackExecutionResultResponseBodyStackResultsDeployments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("deploymentName")
        public String deploymentName;

        /**
         * <strong>example:</strong>
         * <p>Service returned null result</p>
         */
        @NameInMap("jobResult")
        public String jobResult;

        /**
         * <strong>example:</strong>
         * <p>Applied</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><a href="https://iacnext.console.aliyun.com/stack/stack-al181av2bloah5s53hacbp4/details?deploymentName=production&deploymentNo=6&configVersion=v1">https://iacnext.console.aliyun.com/stack/stack-al181av2bloah5s53hacbp4/details?deploymentName=production&amp;deploymentNo=6&amp;configVersion=v1</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetStackExecutionResultResponseBodyStackResultsDeployments build(java.util.Map<String, ?> map) throws Exception {
            GetStackExecutionResultResponseBodyStackResultsDeployments self = new GetStackExecutionResultResponseBodyStackResultsDeployments();
            return TeaModel.build(map, self);
        }

        public GetStackExecutionResultResponseBodyStackResultsDeployments setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public GetStackExecutionResultResponseBodyStackResultsDeployments setJobResult(String jobResult) {
            this.jobResult = jobResult;
            return this;
        }
        public String getJobResult() {
            return this.jobResult;
        }

        public GetStackExecutionResultResponseBodyStackResultsDeployments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackExecutionResultResponseBodyStackResultsDeployments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetStackExecutionResultResponseBodyStackResults extends TeaModel {
        @NameInMap("deployments")
        public java.util.List<GetStackExecutionResultResponseBodyStackResultsDeployments> deployments;

        /**
         * <strong>example:</strong>
         * <p>No corresponding Stack found.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>stack-al181av2bloah5s53hacbp4</p>
         */
        @NameInMap("stackId")
        public String stackId;

        /**
         * <strong>example:</strong>
         * <p>stack-demo</p>
         */
        @NameInMap("stackName")
        public String stackName;

        /**
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("stackStatus")
        public String stackStatus;

        public static GetStackExecutionResultResponseBodyStackResults build(java.util.Map<String, ?> map) throws Exception {
            GetStackExecutionResultResponseBodyStackResults self = new GetStackExecutionResultResponseBodyStackResults();
            return TeaModel.build(map, self);
        }

        public GetStackExecutionResultResponseBodyStackResults setDeployments(java.util.List<GetStackExecutionResultResponseBodyStackResultsDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<GetStackExecutionResultResponseBodyStackResultsDeployments> getDeployments() {
            return this.deployments;
        }

        public GetStackExecutionResultResponseBodyStackResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetStackExecutionResultResponseBodyStackResults setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetStackExecutionResultResponseBodyStackResults setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public GetStackExecutionResultResponseBodyStackResults setStackStatus(String stackStatus) {
            this.stackStatus = stackStatus;
            return this;
        }
        public String getStackStatus() {
            return this.stackStatus;
        }

    }

}
