// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowEdgesRequest extends TeaModel {
    /**
     * <p>The task flow ID. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of updated task flow edges.</p>
     */
    @NameInMap("Edges")
    public java.util.List<UpdateTaskFlowEdgesRequestEdges> edges;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
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
        /**
         * <p>The ID of the task flow edge.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the end node of the edge.</p>
         */
        @NameInMap("NodeEnd")
        public Long nodeEnd;

        /**
         * <p>The ID of the start node of the edge.</p>
         */
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
