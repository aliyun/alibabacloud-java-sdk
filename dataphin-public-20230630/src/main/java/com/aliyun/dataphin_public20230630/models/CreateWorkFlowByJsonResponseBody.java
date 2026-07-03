// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateWorkFlowByJsonResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation result of the workflow node.</p>
     */
    @NameInMap("Data")
    public CreateWorkFlowByJsonResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error details returned by the backend.</p>
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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateWorkFlowByJsonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkFlowByJsonResponseBody self = new CreateWorkFlowByJsonResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkFlowByJsonResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkFlowByJsonResponseBody setData(CreateWorkFlowByJsonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWorkFlowByJsonResponseBodyData getData() {
        return this.data;
    }

    public CreateWorkFlowByJsonResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateWorkFlowByJsonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWorkFlowByJsonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkFlowByJsonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkFlowByJsonResponseBodyData extends TeaModel {
        /**
         * <p>The name and IP address of the server-side execution machine.</p>
         * 
         * <strong>example:</strong>
         * <p>hostName:hostIp</p>
         */
        @NameInMap("HostMachine")
        public String hostMachine;

        /**
         * <p>The scheduling node ID of the workflow node after successful creation.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The workflow ID after successful creation.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        /**
         * <p>The submit ID generated for the pending publish list after submission. Use this ID to publish through the publish domain. You can ignore this value for BASIC projects.</p>
         * 
         * <strong>example:</strong>
         * <p>7891</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        /**
         * <p>The pending publish version number generated after the workflow is submitted. You can ignore this value for BASIC projects.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateWorkFlowByJsonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkFlowByJsonResponseBodyData self = new CreateWorkFlowByJsonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWorkFlowByJsonResponseBodyData setHostMachine(String hostMachine) {
            this.hostMachine = hostMachine;
            return this;
        }
        public String getHostMachine() {
            return this.hostMachine;
        }

        public CreateWorkFlowByJsonResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateWorkFlowByJsonResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public CreateWorkFlowByJsonResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

        public CreateWorkFlowByJsonResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
