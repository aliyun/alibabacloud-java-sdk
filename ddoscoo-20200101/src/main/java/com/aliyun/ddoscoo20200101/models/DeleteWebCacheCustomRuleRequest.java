// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCacheCustomRuleRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to delete the custom rules of the Static Page Caching policy.</p>
     * <br>
     * <p>> You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>An array consisting of the names of the rules that you want to delete.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleNames")
    public java.util.List<String> ruleNames;

    public static DeleteWebCacheCustomRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCacheCustomRuleRequest self = new DeleteWebCacheCustomRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebCacheCustomRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteWebCacheCustomRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteWebCacheCustomRuleRequest setRuleNames(java.util.List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

}
