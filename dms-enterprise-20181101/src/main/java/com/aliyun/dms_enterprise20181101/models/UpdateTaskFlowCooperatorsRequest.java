// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowCooperatorsRequest extends TeaModel {
    /**
     * <p>The IDs of the users who are involved in the task flow to be updated.</p>
     */
    @NameInMap("CooperatorIds")
    public java.util.List<String> cooperatorIds;

    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowCooperatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowCooperatorsRequest self = new UpdateTaskFlowCooperatorsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowCooperatorsRequest setCooperatorIds(java.util.List<String> cooperatorIds) {
        this.cooperatorIds = cooperatorIds;
        return this;
    }
    public java.util.List<String> getCooperatorIds() {
        return this.cooperatorIds;
    }

    public UpdateTaskFlowCooperatorsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowCooperatorsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
