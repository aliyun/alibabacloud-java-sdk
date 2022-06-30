// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessRuleRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Expires")
    public Integer expires;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Rules")
    public String rules;

    public static ModifyWebPreciseAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessRuleRequest self = new ModifyWebPreciseAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebPreciseAccessRuleRequest setExpires(Integer expires) {
        this.expires = expires;
        return this;
    }
    public Integer getExpires() {
        return this.expires;
    }

    public ModifyWebPreciseAccessRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebPreciseAccessRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
