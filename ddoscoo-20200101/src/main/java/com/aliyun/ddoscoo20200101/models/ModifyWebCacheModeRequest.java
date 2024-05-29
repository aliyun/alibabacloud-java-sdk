// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheModeRequest extends TeaModel {
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
     * <p>The cache mode of the Static Page Caching policy. Valid values:</p>
     * <br>
     * <p>*   **standard**: uses the standard cache mode.</p>
     * <p>*   **aggressive**: uses the enhanced cache mode.</p>
     * <p>*   **bypass**: caches no data.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyWebCacheModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheModeRequest self = new ModifyWebCacheModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebCacheModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyWebCacheModeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
