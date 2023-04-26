// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceGroupByRegionRequest extends TeaModel {
    /**
     * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static GetResourceComplianceGroupByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceGroupByRegionRequest self = new GetResourceComplianceGroupByRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceGroupByRegionRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
