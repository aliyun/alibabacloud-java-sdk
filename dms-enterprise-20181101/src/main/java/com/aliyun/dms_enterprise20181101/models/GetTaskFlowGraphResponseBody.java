// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskFlowGraphResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskFlowGraph")
    public GetTaskFlowGraphResponseBodyTaskFlowGraph taskFlowGraph;

    public static GetTaskFlowGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFlowGraphResponseBody self = new GetTaskFlowGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskFlowGraphResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskFlowGraphResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTaskFlowGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskFlowGraphResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskFlowGraphResponseBody setTaskFlowGraph(GetTaskFlowGraphResponseBodyTaskFlowGraph taskFlowGraph) {
        this.taskFlowGraph = taskFlowGraph;
        return this;
    }
    public GetTaskFlowGraphResponseBodyTaskFlowGraph getTaskFlowGraph() {
        return this.taskFlowGraph;
    }

    public static class GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge extends TeaModel {
        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NodeEnd")
        public Long nodeEnd;

        @NameInMap("NodeFrom")
        public Long nodeFrom;

        public static GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge self = new GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge();
            return TeaModel.build(map, self);
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge setNodeEnd(Long nodeEnd) {
            this.nodeEnd = nodeEnd;
            return this;
        }
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge setNodeFrom(Long nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

    }

    public static class GetTaskFlowGraphResponseBodyTaskFlowGraphEdges extends TeaModel {
        @NameInMap("Edge")
        public java.util.List<GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge> edge;

        public static GetTaskFlowGraphResponseBodyTaskFlowGraphEdges build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFlowGraphResponseBodyTaskFlowGraphEdges self = new GetTaskFlowGraphResponseBodyTaskFlowGraphEdges();
            return TeaModel.build(map, self);
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdges setEdge(java.util.List<GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge> edge) {
            this.edge = edge;
            return this;
        }
        public java.util.List<GetTaskFlowGraphResponseBodyTaskFlowGraphEdgesEdge> getEdge() {
            return this.edge;
        }

    }

    public static class GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode extends TeaModel {
        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("GraphParam")
        public String graphParam;

        @NameInMap("NodeConfig")
        public String nodeConfig;

        @NameInMap("NodeContent")
        public String nodeContent;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeType")
        public Long nodeType;

        @NameInMap("TimeVariables")
        public String timeVariables;

        public static GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode self = new GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode();
            return TeaModel.build(map, self);
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setGraphParam(String graphParam) {
            this.graphParam = graphParam;
            return this;
        }
        public String getGraphParam() {
            return this.graphParam;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setNodeConfig(String nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public String getNodeConfig() {
            return this.nodeConfig;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setNodeType(Long nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Long getNodeType() {
            return this.nodeType;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode setTimeVariables(String timeVariables) {
            this.timeVariables = timeVariables;
            return this;
        }
        public String getTimeVariables() {
            return this.timeVariables;
        }

    }

    public static class GetTaskFlowGraphResponseBodyTaskFlowGraphNodes extends TeaModel {
        @NameInMap("Node")
        public java.util.List<GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode> node;

        public static GetTaskFlowGraphResponseBodyTaskFlowGraphNodes build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFlowGraphResponseBodyTaskFlowGraphNodes self = new GetTaskFlowGraphResponseBodyTaskFlowGraphNodes();
            return TeaModel.build(map, self);
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodes setNode(java.util.List<GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<GetTaskFlowGraphResponseBodyTaskFlowGraphNodesNode> getNode() {
            return this.node;
        }

    }

    public static class GetTaskFlowGraphResponseBodyTaskFlowGraph extends TeaModel {
        @NameInMap("CanEdit")
        public Boolean canEdit;

        @NameInMap("DagName")
        public String dagName;

        @NameInMap("Edges")
        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdges edges;

        @NameInMap("Nodes")
        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodes nodes;

        @NameInMap("Status")
        public Long status;

        public static GetTaskFlowGraphResponseBodyTaskFlowGraph build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFlowGraphResponseBodyTaskFlowGraph self = new GetTaskFlowGraphResponseBodyTaskFlowGraph();
            return TeaModel.build(map, self);
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraph setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraph setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraph setEdges(GetTaskFlowGraphResponseBodyTaskFlowGraphEdges edges) {
            this.edges = edges;
            return this;
        }
        public GetTaskFlowGraphResponseBodyTaskFlowGraphEdges getEdges() {
            return this.edges;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraph setNodes(GetTaskFlowGraphResponseBodyTaskFlowGraphNodes nodes) {
            this.nodes = nodes;
            return this;
        }
        public GetTaskFlowGraphResponseBodyTaskFlowGraphNodes getNodes() {
            return this.nodes;
        }

        public GetTaskFlowGraphResponseBodyTaskFlowGraph setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
