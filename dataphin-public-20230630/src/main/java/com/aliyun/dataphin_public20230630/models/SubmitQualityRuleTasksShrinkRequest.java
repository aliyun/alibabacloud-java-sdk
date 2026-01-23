// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityRuleTasksShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public String submitCommandShrink;

    public static SubmitQualityRuleTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityRuleTasksShrinkRequest self = new SubmitQualityRuleTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualityRuleTasksShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitQualityRuleTasksShrinkRequest setSubmitCommandShrink(String submitCommandShrink) {
        this.submitCommandShrink = submitCommandShrink;
        return this;
    }
    public String getSubmitCommandShrink() {
        return this.submitCommandShrink;
    }

}
