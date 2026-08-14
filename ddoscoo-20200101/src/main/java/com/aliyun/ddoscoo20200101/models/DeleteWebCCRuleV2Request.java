// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("RuleNames")
    public String ruleNames;

    public static DeleteWebCCRuleV2Request build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleV2Request self = new DeleteWebCCRuleV2Request();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleV2Request setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteWebCCRuleV2Request setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DeleteWebCCRuleV2Request setRuleNames(String ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public String getRuleNames() {
        return this.ruleNames;
    }

}
