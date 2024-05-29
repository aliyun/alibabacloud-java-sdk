// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheCustomRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name, and the domain name must be associated with an instance that uses the Enhanced function plan. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The details of the custom rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **Name**: the name of the rule. This field is required and must be of the string type.</p>
     * <br>
     * <p>*   **Uri**: the path to the cached page. This field is required and must be of the STRING type.</p>
     * <br>
     * <p>*   **Mode**: the cache mode. This field is required and must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **standard**: uses the standard mode.</p>
     * <p>    *   **aggressive**: uses the enhanced mode.</p>
     * <p>    *   **bypass**: No data is cached.</p>
     * <br>
     * <p>*   **CacheTtl**: the expiration time of the page cache. This field is required and must be of the INTEGER type. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
