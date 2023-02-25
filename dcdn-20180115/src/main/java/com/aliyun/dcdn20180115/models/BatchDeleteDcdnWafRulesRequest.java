// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the protection rules that you want to delete. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    public static BatchDeleteDcdnWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnWafRulesRequest self = new BatchDeleteDcdnWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnWafRulesRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

}
