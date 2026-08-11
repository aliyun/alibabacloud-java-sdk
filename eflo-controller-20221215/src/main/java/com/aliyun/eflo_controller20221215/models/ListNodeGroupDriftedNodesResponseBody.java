// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNodeGroupDriftedNodesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page for a single query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned by this call. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of nodes that are inconsistent with the node group configuration (paginated).</p>
     */
    @NameInMap("Nodes")
    public java.util.List<ListNodeGroupDriftedNodesResponseBodyNodes> nodes;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeGroupDriftedNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupDriftedNodesResponseBody self = new ListNodeGroupDriftedNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupDriftedNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodeGroupDriftedNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodeGroupDriftedNodesResponseBody setNodes(java.util.List<ListNodeGroupDriftedNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodeGroupDriftedNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListNodeGroupDriftedNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts extends TeaModel {
        /**
         * <p>The current value of the node property. Complex types are serialized as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>old-role</p>
         */
        @NameInMap("ActualValue")
        public String actualValue;

        /**
         * <p>The minimum action required to apply the TargetValue: Refresh / Reboot / Reimage. For more information, refer to the MaxDisruptiveAction parameter description in the RefreshNodeGroupNodes operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Refresh</p>
         */
        @NameInMap("MinRequiredAction")
        public String minRequiredAction;

        /**
         * <p>The property path in dot notation (such as a.b.c), compatible with both flat and nested properties.</p>
         * 
         * <strong>example:</strong>
         * <p>RamRoleName</p>
         */
        @NameInMap("PropertyPath")
        public String propertyPath;

        /**
         * <p>The target value of the node property. Complex types are serialized as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>new-role</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        public static ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts build(java.util.Map<String, ?> map) throws Exception {
            ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts self = new ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts();
            return TeaModel.build(map, self);
        }

        public ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts setMinRequiredAction(String minRequiredAction) {
            this.minRequiredAction = minRequiredAction;
            return this;
        }
        public String getMinRequiredAction() {
            return this.minRequiredAction;
        }

        public ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts setPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

    public static class ListNodeGroupDriftedNodesResponseBodyNodes extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>node-001</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The list of inconsistent properties for this node.</p>
         */
        @NameInMap("PropertyDrifts")
        public java.util.List<ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts> propertyDrifts;

        public static ListNodeGroupDriftedNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodeGroupDriftedNodesResponseBodyNodes self = new ListNodeGroupDriftedNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodeGroupDriftedNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNodeGroupDriftedNodesResponseBodyNodes setPropertyDrifts(java.util.List<ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts> propertyDrifts) {
            this.propertyDrifts = propertyDrifts;
            return this;
        }
        public java.util.List<ListNodeGroupDriftedNodesResponseBodyNodesPropertyDrifts> getPropertyDrifts() {
            return this.propertyDrifts;
        }

    }

}
