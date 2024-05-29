// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockSwitchRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the Location Blacklist (Domain Names) policy for a domain name. The value is a string that consists of a JSON struct. The JSON struct contains the following parameters:</p>
     * <br>
     * <p>*   **RegionblockEnable**: the status of the Location Blacklist (Domain Names) policy. This parameter is required and must be of the INTEGER type. Valid values:</p>
     * <br>
     * <p>    *   **1**: enables the policy.</p>
     * <p>    *   **0**: disables the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name for which you want to enable or disable the Location Blacklist policy.</p>
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

    public static ModifyWebAreaBlockSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockSwitchRequest self = new ModifyWebAreaBlockSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockSwitchRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebAreaBlockSwitchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebAreaBlockSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
