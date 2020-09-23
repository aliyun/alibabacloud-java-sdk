// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeOnBaselineResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<GetNodeOnBaselineResponseData> data;

    public static GetNodeOnBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOnBaselineResponse self = new GetNodeOnBaselineResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeOnBaselineResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetNodeOnBaselineResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeOnBaselineResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeOnBaselineResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeOnBaselineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeOnBaselineResponse setData(java.util.List<GetNodeOnBaselineResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNodeOnBaselineResponseData> getData() {
        return this.data;
    }

    public static class GetNodeOnBaselineResponseData extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetNodeOnBaselineResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeOnBaselineResponseData self = new GetNodeOnBaselineResponseData();
            return TeaModel.build(map, self);
        }

        public GetNodeOnBaselineResponseData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeOnBaselineResponseData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeOnBaselineResponseData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetNodeOnBaselineResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
