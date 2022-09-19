// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTaskFlowEdgesRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Edges")
    public java.util.List<AddTaskFlowEdgesRequestEdges> edges;

    @NameInMap("Tid")
    public Long tid;

    public static AddTaskFlowEdgesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTaskFlowEdgesRequest self = new AddTaskFlowEdgesRequest();
        return TeaModel.build(map, self);
    }

    public AddTaskFlowEdgesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public AddTaskFlowEdgesRequest setEdges(java.util.List<AddTaskFlowEdgesRequestEdges> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<AddTaskFlowEdgesRequestEdges> getEdges() {
        return this.edges;
    }

    public AddTaskFlowEdgesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class AddTaskFlowEdgesRequestEdges extends TeaModel {
        @NameInMap("NodeEnd")
        public Long nodeEnd;

        @NameInMap("NodeFrom")
        public Long nodeFrom;

        public static AddTaskFlowEdgesRequestEdges build(java.util.Map<String, ?> map) throws Exception {
            AddTaskFlowEdgesRequestEdges self = new AddTaskFlowEdgesRequestEdges();
            return TeaModel.build(map, self);
        }

        public AddTaskFlowEdgesRequestEdges setNodeEnd(Long nodeEnd) {
            this.nodeEnd = nodeEnd;
            return this;
        }
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        public AddTaskFlowEdgesRequestEdges setNodeFrom(Long nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

    }

}
