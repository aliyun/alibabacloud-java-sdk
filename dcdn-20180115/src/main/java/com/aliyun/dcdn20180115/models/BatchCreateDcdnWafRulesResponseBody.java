// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of created rules.</p>
     */
    @NameInMap("RuleIds")
    public BatchCreateDcdnWafRulesResponseBodyRuleIds ruleIds;

    public static BatchCreateDcdnWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDcdnWafRulesResponseBody self = new BatchCreateDcdnWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateDcdnWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateDcdnWafRulesResponseBody setRuleIds(BatchCreateDcdnWafRulesResponseBodyRuleIds ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public BatchCreateDcdnWafRulesResponseBodyRuleIds getRuleIds() {
        return this.ruleIds;
    }

    public static class BatchCreateDcdnWafRulesResponseBodyRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static BatchCreateDcdnWafRulesResponseBodyRuleIds build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateDcdnWafRulesResponseBodyRuleIds self = new BatchCreateDcdnWafRulesResponseBodyRuleIds();
            return TeaModel.build(map, self);
        }

        public BatchCreateDcdnWafRulesResponseBodyRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

}
