// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTaskFlowEdgesRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of edges of the task flow.</p>
     */
    @NameInMap("Edges")
    public java.util.List<AddTaskFlowEdgesRequestEdges> edges;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
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
         * <p>The error code returned if the request failed.</p>
         */
        @NameInMap("NodeEnd")
        public Long nodeEnd;

        /**
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
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
