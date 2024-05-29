// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessSwitchRequest extends TeaModel {
    /**
     * <p>The configuration of the Accurate Access Control policy. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **PreciseRuleEnable**: the status of the Accurate Access Control policy. This field is required and must be of the INTEGER type. Valid values:</p>
     * <br>
     * <p>    *   **0**: disables the policy.</p>
     * <p>    *   **1**: enables the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for a domain name. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
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

    public static ModifyWebPreciseAccessSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessSwitchRequest self = new ModifyWebPreciseAccessSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessSwitchRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebPreciseAccessSwitchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebPreciseAccessSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
