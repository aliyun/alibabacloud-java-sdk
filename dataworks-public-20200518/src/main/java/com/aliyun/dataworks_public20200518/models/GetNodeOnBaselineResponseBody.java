// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeOnBaselineResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetNodeOnBaselineResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetNodeOnBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOnBaselineResponseBody self = new GetNodeOnBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeOnBaselineResponseBody setData(java.util.List<GetNodeOnBaselineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNodeOnBaselineResponseBodyData> getData() {
        return this.data;
    }

    public GetNodeOnBaselineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeOnBaselineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeOnBaselineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeOnBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeOnBaselineResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetNodeOnBaselineResponseBodyData extends TeaModel {
        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        public static GetNodeOnBaselineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeOnBaselineResponseBodyData self = new GetNodeOnBaselineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeOnBaselineResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeOnBaselineResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeOnBaselineResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetNodeOnBaselineResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
