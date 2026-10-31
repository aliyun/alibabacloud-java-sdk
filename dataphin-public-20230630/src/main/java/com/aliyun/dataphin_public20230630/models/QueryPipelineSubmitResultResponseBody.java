// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class QueryPipelineSubmitResultResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous execution result.</p>
     */
    @NameInMap("Data")
    public QueryPipelineSubmitResultResponseBodyData data;

    /**
     * <p>The HTTP response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend response exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPipelineSubmitResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineSubmitResultResponseBody self = new QueryPipelineSubmitResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPipelineSubmitResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPipelineSubmitResultResponseBody setData(QueryPipelineSubmitResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPipelineSubmitResultResponseBodyData getData() {
        return this.data;
    }

    public QueryPipelineSubmitResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryPipelineSubmitResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPipelineSubmitResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPipelineSubmitResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPipelineSubmitResultResponseBodyData extends TeaModel {
        /**
         * <p>The query ID for asynchronous execution.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AsyncId")
        public Long asyncId;

        /**
         * <p>The check result of the commit details. The value is a JSON character string and is returned only for the asynchronous commit process. The structure is consistent with the commit details on the product page.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test01&quot;:&quot;success&quot;}</p>
         */
        @NameInMap("CheckDetail")
        public String checkDetail;

        /**
         * <p>The error code returned when an execution exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>DPN.Pipeline.InnerError</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when an execution exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>NullPointException</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The server host information for request execution.</p>
         * 
         * <strong>example:</strong>
         * <p>hostName:hostIp</p>
         */
        @NameInMap("HostMachine")
        public String hostMachine;

        /**
         * <p>The ID of the schedule node for the pipeline task.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The primary key ID of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        /**
         * <p>The current execution status. Valid values: SUCCESS: execution succeeded. FAILED: execution failed. RUNNING: execution in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The publish ID generated after the pipeline task is submitted, which is used to publish the task through the publish domain.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        /**
         * <p>The version number generated when the pipeline task is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static QueryPipelineSubmitResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineSubmitResultResponseBodyData self = new QueryPipelineSubmitResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPipelineSubmitResultResponseBodyData setAsyncId(Long asyncId) {
            this.asyncId = asyncId;
            return this;
        }
        public Long getAsyncId() {
            return this.asyncId;
        }

        public QueryPipelineSubmitResultResponseBodyData setCheckDetail(String checkDetail) {
            this.checkDetail = checkDetail;
            return this;
        }
        public String getCheckDetail() {
            return this.checkDetail;
        }

        public QueryPipelineSubmitResultResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryPipelineSubmitResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryPipelineSubmitResultResponseBodyData setHostMachine(String hostMachine) {
            this.hostMachine = hostMachine;
            return this;
        }
        public String getHostMachine() {
            return this.hostMachine;
        }

        public QueryPipelineSubmitResultResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public QueryPipelineSubmitResultResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public QueryPipelineSubmitResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryPipelineSubmitResultResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

        public QueryPipelineSubmitResultResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
