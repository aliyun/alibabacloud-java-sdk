// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest extends TeaModel {
    /**
     * <p>The assignment binding command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssignCommand")
    public String assignCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest self = new AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest setAssignCommandShrink(String assignCommandShrink) {
        this.assignCommandShrink = assignCommandShrink;
        return this;
    }
    public String getAssignCommandShrink() {
        return this.assignCommandShrink;
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
