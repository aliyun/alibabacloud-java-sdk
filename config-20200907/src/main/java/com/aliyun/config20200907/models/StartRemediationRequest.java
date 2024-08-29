// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartRemediationRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-8a973ac2e2be00a2****</p>
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
