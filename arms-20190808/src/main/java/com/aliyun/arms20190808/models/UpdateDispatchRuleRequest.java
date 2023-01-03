// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateDispatchRuleRequest extends TeaModel {
    // The dispatch rule configuration. The value is a JSON string. For more information about this parameter, see the following **additional information about the DispatchRule parameter**.
    @NameInMap("DispatchRule")
    public String dispatchRule;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDispatchRuleRequest self = new UpdateDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDispatchRuleRequest setDispatchRule(String dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    public UpdateDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
