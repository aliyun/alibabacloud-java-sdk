// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskFlowGraphRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The time variables for the node.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetTaskFlowGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFlowGraphRequest self = new GetTaskFlowGraphRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskFlowGraphRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public GetTaskFlowGraphRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
