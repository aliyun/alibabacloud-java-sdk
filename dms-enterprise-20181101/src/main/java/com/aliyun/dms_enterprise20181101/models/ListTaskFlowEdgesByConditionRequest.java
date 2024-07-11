// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowEdgesByConditionRequest extends TeaModel {
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
     * <p>The ID of the task flow edge.</p>
     * 
     * <strong>example:</strong>
     * <p>24***</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the end node on the edge.</p>
     * 
     * <strong>example:</strong>
     * <p>44***</p>
     */
    @NameInMap("NodeEnd")
    public Long nodeEnd;

    /**
     * <p>The ID of the start node on the edge.</p>
     * 
     * <strong>example:</strong>
     * <p>44***</p>
     */
    @NameInMap("NodeFrom")
    public Long nodeFrom;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowEdgesByConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowEdgesByConditionRequest self = new ListTaskFlowEdgesByConditionRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowEdgesByConditionRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTaskFlowEdgesByConditionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListTaskFlowEdgesByConditionRequest setNodeEnd(Long nodeEnd) {
        this.nodeEnd = nodeEnd;
        return this;
    }
    public Long getNodeEnd() {
        return this.nodeEnd;
    }

    public ListTaskFlowEdgesByConditionRequest setNodeFrom(Long nodeFrom) {
        this.nodeFrom = nodeFrom;
        return this;
    }
    public Long getNodeFrom() {
        return this.nodeFrom;
    }

    public ListTaskFlowEdgesByConditionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
