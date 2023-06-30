// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskFlowEdgesByConditionRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the task flow edge to delete.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the end node of the edge to delete.</p>
     */
    @NameInMap("NodeEnd")
    public Long nodeEnd;

    /**
     * <p>The ID of the start node on the edge to delete.</p>
     */
    @NameInMap("NodeFrom")
    public Long nodeFrom;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteTaskFlowEdgesByConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskFlowEdgesByConditionRequest self = new DeleteTaskFlowEdgesByConditionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskFlowEdgesByConditionRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public DeleteTaskFlowEdgesByConditionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteTaskFlowEdgesByConditionRequest setNodeEnd(Long nodeEnd) {
        this.nodeEnd = nodeEnd;
        return this;
    }
    public Long getNodeEnd() {
        return this.nodeEnd;
    }

    public DeleteTaskFlowEdgesByConditionRequest setNodeFrom(Long nodeFrom) {
        this.nodeFrom = nodeFrom;
        return this;
    }
    public Long getNodeFrom() {
        return this.nodeFrom;
    }

    public DeleteTaskFlowEdgesByConditionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
