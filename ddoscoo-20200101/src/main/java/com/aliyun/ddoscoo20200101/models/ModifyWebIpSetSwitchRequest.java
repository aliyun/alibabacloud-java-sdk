// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebIpSetSwitchRequest extends TeaModel {
    /**
     * <p>The details of the Black Lists and White Lists (Domain Names) policy. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **Bwlist_Enable**: the status of the Black Lists and White Lists (Domain Names) policy. This field is required and must be of the integer type. Valid values:</p>
     * <br>
     * <p>    *   **0**: disabled</p>
     * <p>    *   **1**: enabled</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyWebIpSetSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebIpSetSwitchRequest self = new ModifyWebIpSetSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebIpSetSwitchRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebIpSetSwitchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebIpSetSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
