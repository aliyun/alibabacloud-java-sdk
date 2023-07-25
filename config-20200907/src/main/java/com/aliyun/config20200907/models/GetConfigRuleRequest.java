// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static GetConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleRequest self = new GetConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
