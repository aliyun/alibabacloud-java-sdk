// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockSwitchRequest extends TeaModel {
    /**
     * <p>The status of the Location Blacklist feature (for domain names). This parameter is a string that is converted from a JSON struct. The JSON struct contains the following parameter:</p>
     * <ul>
     * <li><p><strong>RegionblockEnable</strong>: An Integer value that is required. The status of the Location Blacklist feature (for domain names). Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: enables the feature.</p>
     * </li>
     * <li><p><strong>0</strong>: disables the feature.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RegionblockEnable&quot;: 1}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name for which you want to set the Location Blacklist feature.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names that are protected by Anti-DDoS Proxy.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Proxy instance belongs in Resource Management.</p>
     * <p>If you do not set this parameter, the default resource group is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
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
