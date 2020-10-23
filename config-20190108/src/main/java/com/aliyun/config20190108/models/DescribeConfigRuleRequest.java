// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigRuleRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    public String configRuleId;

    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    @NameInMap("MemberId")
    public Long memberId;

    public static DescribeConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigRuleRequest self = new DescribeConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public DescribeConfigRuleRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public DescribeConfigRuleRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
