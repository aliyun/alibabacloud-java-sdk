// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheSwitchRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to configure the Static Page Caching policy.</p>
     * <br>
     * <p>> You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to enable or disable the Static Page Caching policy for a website. Valid values:</p>
     * <br>
     * <p>*   **1**: enables the policy.</p>
     * <p>*   **0**: disables the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyWebCacheSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheSwitchRequest self = new ModifyWebCacheSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheSwitchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebCacheSwitchRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public ModifyWebCacheSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
