// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigRuleRequest extends TeaModel {
    /**
     * <p>The ID of the rule. You can call the [ListConfigRules](~~169607~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>This parameter is unavailable since 00:00:00 on June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00 on May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00 on May 30, 2021. For information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter is unavailable since 00:00:00 on June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00 on May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00 on May 30, 2021. For information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

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

    public DescribeConfigRuleRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public DescribeConfigRuleRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

}
