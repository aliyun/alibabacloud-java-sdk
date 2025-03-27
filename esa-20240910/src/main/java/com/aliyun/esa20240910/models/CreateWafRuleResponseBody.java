// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWafRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the WAF rule, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850237.html">ListWafRules</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>ID of the WAF ruleset, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850233.html">ListWafRulesets</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    public static CreateWafRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWafRuleResponseBody self = new CreateWafRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWafRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateWafRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWafRuleResponseBody setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

}
