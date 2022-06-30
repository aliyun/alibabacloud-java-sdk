// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheCustomRuleRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Rules")
    public String rules;

    public static ModifyWebCacheCustomRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheCustomRuleRequest self = new ModifyWebCacheCustomRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheCustomRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebCacheCustomRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebCacheCustomRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
