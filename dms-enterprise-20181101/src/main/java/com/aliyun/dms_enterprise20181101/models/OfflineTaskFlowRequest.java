// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class OfflineTaskFlowRequest extends TeaModel {
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

    public static OfflineTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineTaskFlowRequest self = new OfflineTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public OfflineTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public OfflineTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
