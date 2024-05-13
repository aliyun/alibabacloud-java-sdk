// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsShrinkRequest extends TeaModel {
    /**
     * <p>The constants for the task flow.</p>
     */
    @NameInMap("DagConstants")
    public String dagConstantsShrink;

    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to query the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowConstantsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowConstantsShrinkRequest self = new UpdateTaskFlowConstantsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowConstantsShrinkRequest setDagConstantsShrink(String dagConstantsShrink) {
        this.dagConstantsShrink = dagConstantsShrink;
        return this;
    }
    public String getDagConstantsShrink() {
        return this.dagConstantsShrink;
    }

    public UpdateTaskFlowConstantsShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowConstantsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
