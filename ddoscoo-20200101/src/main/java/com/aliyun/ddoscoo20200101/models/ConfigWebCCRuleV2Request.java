// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCRuleV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Expires")
    public Long expires;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;action&quot;:&quot;block&quot;,&quot;name&quot;:&quot;trdsss&quot;,&quot;ratelimit&quot;:{&quot;interval&quot;:60,&quot;ttl&quot;:300,&quot;threshold&quot;:70,&quot;target&quot;:&quot;ip&quot;},&quot;condition&quot;:[{&quot;field&quot;:&quot;ip&quot;,&quot;match_method&quot;:&quot;belong&quot;,&quot;content&quot;:&quot;1.1.1.1&quot;}]}]</p>
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
