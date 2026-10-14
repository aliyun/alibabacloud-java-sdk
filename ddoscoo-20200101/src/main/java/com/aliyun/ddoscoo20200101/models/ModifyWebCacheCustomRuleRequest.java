// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheCustomRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for the domain name, and the domain name must be associated with an instance that uses the Enhanced function plan. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The details of the custom rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <ul>
     * <li><p><strong>Name</strong>: the name of the rule. This field is required and must be of the string type.</p>
     * </li>
     * <li><p><strong>Uri</strong>: the path to the cached page. This field is required and must be of the STRING type.</p>
     * </li>
     * <li><p><strong>Mode</strong>: the cache mode. This field is required and must be of the STRING type. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: uses the standard mode.</li>
     * <li><strong>aggressive</strong>: uses the enhanced mode.</li>
     * <li><strong>bypass</strong>: No data is cached.</li>
     * </ul>
     * </li>
     * <li><p><strong>CacheTtl</strong>: the expiration time of the page cache. This field is required and must be of the INTEGER type. Unit: seconds.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;: &quot;test&quot;,&quot;Uri&quot;: &quot;/a&quot;,&quot;Mode&quot;: &quot;standard&quot;,&quot;CacheTtl&quot;: 3600}]</p>
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
