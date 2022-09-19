// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowConstantsRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowConstantsRequest self = new ListTaskFlowConstantsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowConstantsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTaskFlowConstantsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
