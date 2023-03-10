// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for a domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The name of the custom frequency control rule that you want to delete.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteWebCCRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleRequest self = new DeleteWebCCRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteWebCCRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteWebCCRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
