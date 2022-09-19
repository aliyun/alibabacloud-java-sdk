// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowEdgesRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Edges")
    public java.util.List<UpdateTaskFlowEdgesRequestEdges> edges;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowEdgesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowEdgesRequest self = new UpdateTaskFlowEdgesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowEdgesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowEdgesRequest setEdges(java.util.List<UpdateTaskFlowEdgesRequestEdges> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<UpdateTaskFlowEdgesRequestEdges> getEdges() {
        return this.edges;
    }

    public UpdateTaskFlowEdgesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class UpdateTaskFlowEdgesRequestEdges extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("NodeEnd")
        public Long nodeEnd;

        @NameInMap("NodeFrom")
        public Long nodeFrom;

        public static UpdateTaskFlowEdgesRequestEdges build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskFlowEdgesRequestEdges self = new UpdateTaskFlowEdgesRequestEdges();
            return TeaModel.build(map, self);
        }

        public UpdateTaskFlowEdgesRequestEdges setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateTaskFlowEdgesRequestEdges setNodeEnd(Long nodeEnd) {
            this.nodeEnd = nodeEnd;
            return this;
        }
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        public UpdateTaskFlowEdgesRequestEdges setNodeFrom(Long nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

    }

}
