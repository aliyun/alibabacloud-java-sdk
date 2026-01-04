// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainCcProtectSwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDomainCcProtectSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcProtectSwitchRequest self = new DescribeDomainCcProtectSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcProtectSwitchRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeDomainCcProtectSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
