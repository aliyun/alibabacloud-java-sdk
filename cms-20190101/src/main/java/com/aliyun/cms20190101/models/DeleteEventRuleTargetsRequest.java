// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRuleTargetsRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<String> ids;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the target. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DeleteEventRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRuleTargetsRequest self = new DeleteEventRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRuleTargetsRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public DeleteEventRuleTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteEventRuleTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
