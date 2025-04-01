// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateWafRulesResponseBody extends TeaModel {
    /**
     * <p>ID of the WAF rule, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2878257.html">ListWafRules</a> interface.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>ID of the WAF ruleset, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    public static BatchCreateWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateWafRulesResponseBody self = new BatchCreateWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateWafRulesResponseBody setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public BatchCreateWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateWafRulesResponseBody setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

}
