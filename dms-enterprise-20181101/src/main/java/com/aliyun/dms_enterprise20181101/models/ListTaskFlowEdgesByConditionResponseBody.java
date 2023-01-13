// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowEdgesByConditionResponseBody extends TeaModel {
    /**
     * <p>The list of task flow edges.</p>
     */
    @NameInMap("Edges")
    public ListTaskFlowEdgesByConditionResponseBodyEdges edges;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTaskFlowEdgesByConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowEdgesByConditionResponseBody self = new ListTaskFlowEdgesByConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowEdgesByConditionResponseBody setEdges(ListTaskFlowEdgesByConditionResponseBodyEdges edges) {
        this.edges = edges;
        return this;
    }
    public ListTaskFlowEdgesByConditionResponseBodyEdges getEdges() {
        return this.edges;
    }

    public ListTaskFlowEdgesByConditionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowEdgesByConditionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowEdgesByConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowEdgesByConditionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskFlowEdgesByConditionResponseBodyEdgesEdge extends TeaModel {
        /**
         * <p>The ID of the task flow edge.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the end node on the edge.</p>
         */
        @NameInMap("NodeEnd")
        public Long nodeEnd;

        /**
         * <p>The ID of the start node on the edge.</p>
         */
        @NameInMap("NodeFrom")
        public Long nodeFrom;

        public static ListTaskFlowEdgesByConditionResponseBodyEdgesEdge build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowEdgesByConditionResponseBodyEdgesEdge self = new ListTaskFlowEdgesByConditionResponseBodyEdgesEdge();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowEdgesByConditionResponseBodyEdgesEdge setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskFlowEdgesByConditionResponseBodyEdgesEdge setNodeEnd(Long nodeEnd) {
            this.nodeEnd = nodeEnd;
            return this;
        }
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        public ListTaskFlowEdgesByConditionResponseBodyEdgesEdge setNodeFrom(Long nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

    }

    public static class ListTaskFlowEdgesByConditionResponseBodyEdges extends TeaModel {
        @NameInMap("Edge")
        public java.util.List<ListTaskFlowEdgesByConditionResponseBodyEdgesEdge> edge;

        public static ListTaskFlowEdgesByConditionResponseBodyEdges build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowEdgesByConditionResponseBodyEdges self = new ListTaskFlowEdgesByConditionResponseBodyEdges();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowEdgesByConditionResponseBodyEdges setEdge(java.util.List<ListTaskFlowEdgesByConditionResponseBodyEdgesEdge> edge) {
            this.edge = edge;
            return this;
        }
        public java.util.List<ListTaskFlowEdgesByConditionResponseBodyEdgesEdge> getEdge() {
            return this.edge;
        }

    }

}
