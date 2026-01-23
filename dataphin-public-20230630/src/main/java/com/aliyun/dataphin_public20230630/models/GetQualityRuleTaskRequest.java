// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityRuleTaskRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("RuleTaskId")
    public Long ruleTaskId;

    public static GetQualityRuleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTaskRequest self = new GetQualityRuleTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualityRuleTaskRequest setRuleTaskId(Long ruleTaskId) {
        this.ruleTaskId = ruleTaskId;
        return this;
    }
    public Long getRuleTaskId() {
        return this.ruleTaskId;
    }

}
