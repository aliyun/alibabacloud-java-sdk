// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserWafRulesetResponseBody extends TeaModel {
    /**
     * <p>The WAF ruleset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of rule IDs within the WAF ruleset.</p>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    public static CreateUserWafRulesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWafRulesetResponseBody self = new CreateUserWafRulesetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserWafRulesetResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateUserWafRulesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserWafRulesetResponseBody setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

}
