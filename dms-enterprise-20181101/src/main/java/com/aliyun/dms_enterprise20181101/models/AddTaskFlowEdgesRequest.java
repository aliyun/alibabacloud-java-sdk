// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTaskFlowEdgesRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of edges of the task flow.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Edges")
    public java.util.List<AddTaskFlowEdgesRequestEdges> edges;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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
        /**
         * <p>The ID of the node where the end node of the edge is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>44***</p>
         */
        @NameInMap("NodeEnd")
        public Long nodeEnd;

        /**
         * <p>The ID of the node where the start node of the edge is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>44***</p>
         */
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
