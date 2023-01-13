// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowOwnerRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlowInstance](~~424689~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The user ID of the new owner. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the user ID.</p>
     */
    @NameInMap("NewOwnerId")
    public String newOwnerId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowOwnerRequest self = new UpdateTaskFlowOwnerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowOwnerRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowOwnerRequest setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
        return this;
    }
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    public UpdateTaskFlowOwnerRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
