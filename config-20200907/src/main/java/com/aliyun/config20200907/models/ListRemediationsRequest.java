// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationsRequest extends TeaModel {
    /**
     * <p>The ID of the rule. If you want to specify multiple IDs, separate them with commas (,).</p>
     * <br>
     * <p>You can call the [ListConfigRules](~~169607~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ListRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationsRequest self = new ListRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public ListRemediationsRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
