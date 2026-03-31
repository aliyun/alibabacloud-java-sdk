// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-fe416457e0d90022****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    /**
     * <p>The rule ID. Separate multiple rule IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cr-2da35180a8d1008e****,cr-2da35180a8d1008e****</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ActiveConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesRequest self = new ActiveConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public ActiveConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
