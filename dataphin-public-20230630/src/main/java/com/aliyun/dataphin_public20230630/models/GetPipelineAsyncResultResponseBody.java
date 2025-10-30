// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineAsyncResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPipelineAsyncResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
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

    @NameInMap("Success")
    public Boolean success;

    public static GetPipelineAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineAsyncResultResponseBody self = new GetPipelineAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineAsyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPipelineAsyncResultResponseBody setData(GetPipelineAsyncResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPipelineAsyncResultResponseBodyData getData() {
        return this.data;
    }

    public GetPipelineAsyncResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPipelineAsyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPipelineAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineAsyncResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineAsyncResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AsyncId")
        public Long asyncId;

        /**
         * <strong>example:</strong>
         * <p>DPN.Pipeline.InnerError</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>NullPointException</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>hostName:hostIp</p>
         */
        @NameInMap("HostMachine")
        public String hostMachine;

        /**
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetPipelineAsyncResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineAsyncResultResponseBodyData self = new GetPipelineAsyncResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPipelineAsyncResultResponseBodyData setAsyncId(Long asyncId) {
            this.asyncId = asyncId;
            return this;
        }
        public Long getAsyncId() {
            return this.asyncId;
        }

        public GetPipelineAsyncResultResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetPipelineAsyncResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetPipelineAsyncResultResponseBodyData setHostMachine(String hostMachine) {
            this.hostMachine = hostMachine;
            return this;
        }
        public String getHostMachine() {
            return this.hostMachine;
        }

        public GetPipelineAsyncResultResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPipelineAsyncResultResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public GetPipelineAsyncResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineAsyncResultResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

        public GetPipelineAsyncResultResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
