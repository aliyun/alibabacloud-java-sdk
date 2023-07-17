// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleRequest extends TeaModel {
    @NameInMap("DispatchRule")
    public String dispatchRule;

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
