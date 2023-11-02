// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostRuleStatusChangeRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("InUse")
    public Boolean inUse;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleType")
    public String ruleType;

    public static PostRuleStatusChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        PostRuleStatusChangeRequest self = new PostRuleStatusChangeRequest();
        return TeaModel.build(map, self);
    }

    public PostRuleStatusChangeRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public PostRuleStatusChangeRequest setInUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }
    public Boolean getInUse() {
        return this.inUse;
    }

    public PostRuleStatusChangeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostRuleStatusChangeRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
