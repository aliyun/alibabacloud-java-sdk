// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskFlowEdgesByConditionRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("NodeEnd")
    public Long nodeEnd;

    @NameInMap("NodeFrom")
    public Long nodeFrom;

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
