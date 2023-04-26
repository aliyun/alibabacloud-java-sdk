// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartRemediationRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static StartRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRemediationRequest self = new StartRemediationRequest();
        return TeaModel.build(map, self);
    }

    public StartRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
