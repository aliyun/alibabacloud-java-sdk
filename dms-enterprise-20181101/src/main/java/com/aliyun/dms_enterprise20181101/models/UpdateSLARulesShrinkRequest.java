// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateSLARulesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of SLA rules.</p>
     */
    @NameInMap("SlaRuleList")
    public String slaRuleListShrink;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateSLARulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSLARulesShrinkRequest self = new UpdateSLARulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSLARulesShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateSLARulesShrinkRequest setSlaRuleListShrink(String slaRuleListShrink) {
        this.slaRuleListShrink = slaRuleListShrink;
        return this;
    }
    public String getSlaRuleListShrink() {
        return this.slaRuleListShrink;
    }

    public UpdateSLARulesShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
