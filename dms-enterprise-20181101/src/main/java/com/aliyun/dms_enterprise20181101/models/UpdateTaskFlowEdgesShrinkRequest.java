// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowEdgesShrinkRequest extends TeaModel {
    /**
     * <p>The task flow ID. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to query the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of updated task flow edges.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Edges")
    public String edgesShrink;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowEdgesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowEdgesShrinkRequest self = new UpdateTaskFlowEdgesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowEdgesShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowEdgesShrinkRequest setEdgesShrink(String edgesShrink) {
        this.edgesShrink = edgesShrink;
        return this;
    }
    public String getEdgesShrink() {
        return this.edgesShrink;
    }

    public UpdateTaskFlowEdgesShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
