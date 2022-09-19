// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateSLARulesShrinkRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("SlaRuleList")
    public String slaRuleListShrink;

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
