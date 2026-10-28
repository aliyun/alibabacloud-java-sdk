// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OperatorNode extends TeaModel {
    /**
     * <p>The child operator queue.</p>
     */
    @NameInMap("children")
    public java.util.List<OperatorNode> children;

    /**
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("id")
    public Integer id;

    /**
     * <p>The total number of nodes at the tree level of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("levelWidth")
    public Integer levelWidth;

    /**
     * <p>The level of the operator in the tree.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nodeDepth")
    public Integer nodeDepth;

    /**
     * <p>The operator name.</p>
     * 
     * <strong>example:</strong>
     * <p>TableScan</p>
     */
    @NameInMap("nodeName")
    public String nodeName;

    /**
     * <p>The left-to-right position of the node at the corresponding level.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nodeWidth")
    public Integer nodeWidth;

    /**
     * <p>The parent operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("parentId")
    public Integer parentId;

    /**
     * <p>The operator statistics information.</p>
     */
    @NameInMap("stats")
    public OperatorNodeStats stats;

    public static OperatorNode build(java.util.Map<String, ?> map) throws Exception {
        OperatorNode self = new OperatorNode();
        return TeaModel.build(map, self);
    }

    public OperatorNode setChildren(java.util.List<OperatorNode> children) {
        this.children = children;
        return this;
    }
    public java.util.List<OperatorNode> getChildren() {
        return this.children;
    }

    public OperatorNode setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public OperatorNode setLevelWidth(Integer levelWidth) {
        this.levelWidth = levelWidth;
        return this;
    }
    public Integer getLevelWidth() {
        return this.levelWidth;
    }

    public OperatorNode setNodeDepth(Integer nodeDepth) {
        this.nodeDepth = nodeDepth;
        return this;
    }
    public Integer getNodeDepth() {
        return this.nodeDepth;
    }

    public OperatorNode setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public OperatorNode setNodeWidth(Integer nodeWidth) {
        this.nodeWidth = nodeWidth;
        return this;
    }
    public Integer getNodeWidth() {
        return this.nodeWidth;
    }

    public OperatorNode setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }
    public Integer getParentId() {
        return this.parentId;
    }

    public OperatorNode setStats(OperatorNodeStats stats) {
        this.stats = stats;
        return this;
    }
    public OperatorNodeStats getStats() {
        return this.stats;
    }

    public static class OperatorNodeStats extends TeaModel {
        /**
         * <p>The data volume.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("bytes")
        public Long bytes;

        /**
         * <p>The number of output rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outputRows")
        public Long outputRows;

        /**
         * <p>The operator parameters.</p>
         */
        @NameInMap("parameters")
        public String parameters;

        /**
         * <p>The maximum memory size consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("peakMemory")
        public Long peakMemory;

        /**
         * <p>The execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("timeCost")
        public Long timeCost;

        public static OperatorNodeStats build(java.util.Map<String, ?> map) throws Exception {
            OperatorNodeStats self = new OperatorNodeStats();
            return TeaModel.build(map, self);
        }

        public OperatorNodeStats setBytes(Long bytes) {
            this.bytes = bytes;
            return this;
        }
        public Long getBytes() {
            return this.bytes;
        }

        public OperatorNodeStats setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public OperatorNodeStats setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public OperatorNodeStats setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public OperatorNodeStats setTimeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public Long getTimeCost() {
            return this.timeCost;
        }

    }

}
