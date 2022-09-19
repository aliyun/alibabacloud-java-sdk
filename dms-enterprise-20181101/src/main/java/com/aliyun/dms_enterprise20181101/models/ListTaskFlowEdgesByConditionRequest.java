// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowEdgesByConditionRequest extends TeaModel {
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
