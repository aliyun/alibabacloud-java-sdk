// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByBaselineResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public java.util.List<ListNodesByBaselineResponseBodyData> data;

    public static ListNodesByBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByBaselineResponseBody self = new ListNodesByBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesByBaselineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesByBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesByBaselineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesByBaselineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesByBaselineResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListNodesByBaselineResponseBody setData(java.util.List<ListNodesByBaselineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesByBaselineResponseBodyData> getData() {
        return this.data;
    }

    public static class ListNodesByBaselineResponseBodyData extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("ProjectId")
        public Long projectId;

        public static ListNodesByBaselineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByBaselineResponseBodyData self = new ListNodesByBaselineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesByBaselineResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListNodesByBaselineResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesByBaselineResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodesByBaselineResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
