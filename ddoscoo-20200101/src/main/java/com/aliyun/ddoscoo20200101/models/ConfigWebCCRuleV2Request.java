// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCRuleV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Expires")
    public Long expires;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleList")
    public String ruleList;

    public static ConfigWebCCRuleV2Request build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebCCRuleV2Request self = new ConfigWebCCRuleV2Request();
        return TeaModel.build(map, self);
    }

    public ConfigWebCCRuleV2Request setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigWebCCRuleV2Request setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

    public ConfigWebCCRuleV2Request setRuleList(String ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public String getRuleList() {
        return this.ruleList;
    }

}
