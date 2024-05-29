// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectModeRequest extends TeaModel {
    /**
     * <p>The details of the Intelligent Protection policy. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **AiTemplate**: the level of the Intelligent Protection policy. This field is required and must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **level30**: the Low level</p>
     * <p>    *   **level60**: the Normal level</p>
     * <p>    *   **level90**: the Strict level</p>
     * <br>
     * <p>*   **AiMode**: the mode of the Intelligent Protection policy. This field is required and must be of the string type. Valid values:</p>
     * <br>
     * <p>    *   **watch**: the Warning mode</p>
     * <p>    *   **defense**: the Defense mode</p>
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

    public static ModifyWebAIProtectModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectModeRequest self = new ModifyWebAIProtectModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectModeRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebAIProtectModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebAIProtectModeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
