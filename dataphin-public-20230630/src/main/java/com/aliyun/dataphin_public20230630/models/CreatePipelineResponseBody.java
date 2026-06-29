// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineResponseBody extends TeaModel {
    /**
     * <p>Backend response code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Integration pipeline/workflow task creation result</p>
     */
    @NameInMap("Data")
    public CreatePipelineResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Backend response exception details</p>
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
     * <p>Whether the request was successful</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreatePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineResponseBody self = new CreatePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePipelineResponseBody setData(CreatePipelineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePipelineResponseBodyData getData() {
        return this.data;
    }

    public CreatePipelineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePipelineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePipelineResponseBodyData extends TeaModel {
        /**
         * <p>Server-side execution machine name and IP</p>
         * 
         * <strong>example:</strong>
         * <p>hostName:hostIp</p>
         */
        @NameInMap("HostMachine")
        public String hostMachine;

        /**
         * <p>Scheduling node ID of the pipeline/workflow task after successful creation</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Pipeline/workflow ID after successful creation</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        /**
         * <p>Submit ID of the pending release list generated after successfully submitting the pipeline, used for release through the release domain.
         * Workflow tasks only support PROD, so this value is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        /**
         * <p>Pending release version number generated after pipeline submission.
         * Workflow tasks only support PROD, so this value is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreatePipelineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineResponseBodyData self = new CreatePipelineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePipelineResponseBodyData setHostMachine(String hostMachine) {
            this.hostMachine = hostMachine;
            return this;
        }
        public String getHostMachine() {
            return this.hostMachine;
        }

        public CreatePipelineResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreatePipelineResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public CreatePipelineResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

        public CreatePipelineResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
