// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CheckRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
     */
    @NameInMap("ResourceArn")
    public String resourceArn;

    /**
     * <strong>example:</strong>
     * <p>rule-000***dav</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static CheckRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRulesRequest self = new CheckRulesRequest();
        return TeaModel.build(map, self);
    }

    public CheckRulesRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public CheckRulesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
