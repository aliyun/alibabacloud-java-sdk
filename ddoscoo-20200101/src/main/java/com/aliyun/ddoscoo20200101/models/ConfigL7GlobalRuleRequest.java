// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7GlobalRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;RuleId\&quot;:\&quot;global_01\&quot;,\&quot;Action\&quot;:\&quot;block\&quot;,\&quot;Enabled\&quot;:0}]</p>
     */
    @NameInMap("RuleAttr")
    public String ruleAttr;

    public static ConfigL7GlobalRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7GlobalRuleRequest self = new ConfigL7GlobalRuleRequest();
        return TeaModel.build(map, self);
    }

    public ConfigL7GlobalRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigL7GlobalRuleRequest setRuleAttr(String ruleAttr) {
        this.ruleAttr = ruleAttr;
        return this;
    }
    public String getRuleAttr() {
        return this.ruleAttr;
    }

}
