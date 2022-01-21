// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteDynamicTagGroupRequest extends TeaModel {
    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDynamicTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicTagGroupRequest self = new DeleteDynamicTagGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicTagGroupRequest setDynamicTagRuleId(String dynamicTagRuleId) {
        this.dynamicTagRuleId = dynamicTagRuleId;
        return this;
    }
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }

    public DeleteDynamicTagGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
