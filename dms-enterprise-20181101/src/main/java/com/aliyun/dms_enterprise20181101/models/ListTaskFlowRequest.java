// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagInstanceId")
    public Long dagInstanceId;

    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowRequest self = new ListTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTaskFlowRequest setDagInstanceId(Long dagInstanceId) {
        this.dagInstanceId = dagInstanceId;
        return this;
    }
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    public ListTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
