// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleRequest extends TeaModel {
    /**
     * <p>The dispatch rule configuration. The value is a JSON string. For more information about this parameter, see the following **additional information about the DispatchRule parameter**.</p>
     */
    @NameInMap("DispatchRule")
    public String dispatchRule;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDispatchRuleRequest self = new CreateDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDispatchRuleRequest setDispatchRule(String dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    public CreateDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
