// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7GlobalRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website service to configure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The action and switch settings for global template rules. The value is a string converted from a JSON struct array. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><strong>RuleId</strong>: String | Required | The rule ID.</li>
     * <li><strong>Action</strong>: String | Required | The rule action. Valid values:<ul>
     * <li><strong>block</strong>: Block.</li>
     * <li><strong>watch</strong>: Monitor.</li>
     * <li><strong>challenge</strong>: JavaScript Challenge.</li>
     * </ul>
     * </li>
     * <li><strong>Enabled</strong>: Integer | Required | The rule switch. Valid values:<ul>
     * <li><strong>1</strong>: enables the rule.</li>
     * <li><strong>0</strong>: disables the rule.</li>
     * </ul>
     * </li>
     * </ul>
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
