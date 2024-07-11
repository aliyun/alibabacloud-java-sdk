// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleV2Request extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The source of the rule. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong> (default): manually created.</li>
     * <li><strong>clover</strong>: automatically created. Specify this value when you want to delete intelligent protection rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The names of the rules that you want to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;trdsss\&quot;]</p>
     */
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
