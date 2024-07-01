// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OperatorNode extends TeaModel {
    @NameInMap("children")
    public java.util.List<OperatorNode> children;

    @NameInMap("id")
    public Integer id;

    @NameInMap("levelWidth")
    public Integer levelWidth;

    @NameInMap("nodeDepth")
    public Integer nodeDepth;

    @NameInMap("nodeName")
    public String nodeName;

    @NameInMap("nodeWidth")
    public Integer nodeWidth;

    @NameInMap("parentId")
    public Integer parentId;

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
        @NameInMap("bytes")
        public Long bytes;

        @NameInMap("outputRows")
        public Long outputRows;

        @NameInMap("parameters")
        public String parameters;

        @NameInMap("peakMemory")
        public Long peakMemory;

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
