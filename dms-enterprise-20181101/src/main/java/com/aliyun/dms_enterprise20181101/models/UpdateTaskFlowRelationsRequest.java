// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowRelationsRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Edges")
    public java.util.List<UpdateTaskFlowRelationsRequestEdges> edges;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowRelationsRequest self = new UpdateTaskFlowRelationsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowRelationsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowRelationsRequest setEdges(java.util.List<UpdateTaskFlowRelationsRequestEdges> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<UpdateTaskFlowRelationsRequestEdges> getEdges() {
        return this.edges;
    }

    public UpdateTaskFlowRelationsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class UpdateTaskFlowRelationsRequestEdges extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("NodeEnd")
        public Long nodeEnd;

        @NameInMap("NodeFrom")
        public Long nodeFrom;

        public static UpdateTaskFlowRelationsRequestEdges build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskFlowRelationsRequestEdges self = new UpdateTaskFlowRelationsRequestEdges();
            return TeaModel.build(map, self);
        }

        public UpdateTaskFlowRelationsRequestEdges setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateTaskFlowRelationsRequestEdges setNodeEnd(Long nodeEnd) {
            this.nodeEnd = nodeEnd;
            return this;
        }
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        public UpdateTaskFlowRelationsRequestEdges setNodeFrom(Long nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

    }

}
