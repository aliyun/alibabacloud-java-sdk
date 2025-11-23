// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TryRunTaskFlowRequest extends TeaModel {
    /**
     * <p>The task flow ID. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the ID of the task flow.</p>
     * 
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
