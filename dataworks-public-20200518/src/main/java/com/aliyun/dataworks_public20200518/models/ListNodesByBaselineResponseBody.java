// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByBaselineResponseBody extends TeaModel {
    /**
     * <p>The name of the node.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListNodesByBaselineResponseBodyData> data;

    /**
     * <p>The nodes in the baseline.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListNodesByBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByBaselineResponseBody self = new ListNodesByBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesByBaselineResponseBody setData(java.util.List<ListNodesByBaselineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesByBaselineResponseBodyData> getData() {
        return this.data;
    }

    public ListNodesByBaselineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesByBaselineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public ListNodesByBaselineResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListNodesByBaselineResponseBodyData extends TeaModel {
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        public static ListNodesByBaselineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByBaselineResponseBodyData self = new ListNodesByBaselineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesByBaselineResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodesByBaselineResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesByBaselineResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
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
