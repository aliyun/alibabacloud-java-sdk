// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskFlowRequest extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskFlowRequest self = new DeleteTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public DeleteTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
