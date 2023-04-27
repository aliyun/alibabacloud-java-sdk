// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowTimeVariablesRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowTimeVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowTimeVariablesRequest self = new ListTaskFlowTimeVariablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowTimeVariablesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTaskFlowTimeVariablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
