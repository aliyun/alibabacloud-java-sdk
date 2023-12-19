// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecutePolicyV2Request extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("SourceType")
    public String sourceType;

    public static ExecutePolicyV2Request build(java.util.Map<String, ?> map) throws Exception {
        ExecutePolicyV2Request self = new ExecutePolicyV2Request();
        return TeaModel.build(map, self);
    }

    public ExecutePolicyV2Request setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ExecutePolicyV2Request setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ExecutePolicyV2Request setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ExecutePolicyV2Request setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
