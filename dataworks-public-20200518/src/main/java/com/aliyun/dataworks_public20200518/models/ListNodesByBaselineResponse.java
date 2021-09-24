// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByBaselineResponse extends TeaModel {
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
    public java.util.List<ListNodesByBaselineResponseData> data;

    public static ListNodesByBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByBaselineResponse self = new ListNodesByBaselineResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesByBaselineResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListNodesByBaselineResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesByBaselineResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesByBaselineResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesByBaselineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesByBaselineResponse setData(java.util.List<ListNodesByBaselineResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesByBaselineResponseData> getData() {
        return this.data;
    }

    public static class ListNodesByBaselineResponseData extends TeaModel {
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

        public static ListNodesByBaselineResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByBaselineResponseData self = new ListNodesByBaselineResponseData();
            return TeaModel.build(map, self);
        }

        public ListNodesByBaselineResponseData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodesByBaselineResponseData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesByBaselineResponseData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListNodesByBaselineResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
