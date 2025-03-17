// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TryRunTaskFlowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11****</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    public static TryRunTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        TryRunTaskFlowRequest self = new TryRunTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public TryRunTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

}
