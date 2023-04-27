// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTasksInTaskFlowRequest extends TeaModel {
    /**
     * <p>The name of the node.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTasksInTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksInTaskFlowRequest self = new ListTasksInTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksInTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTasksInTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
