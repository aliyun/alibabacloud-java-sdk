// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectModeRequest extends TeaModel {
    /**
     * <p>The details of the Intelligent Protection policy. This parameter is a JSON string. The string contains the following fields:</p>
     * <ul>
     * <li><p><strong>AiTemplate</strong>: the level of the Intelligent Protection policy. This field is required and must be of the STRING type. Valid values:</p>
     * <ul>
     * <li><strong>level30</strong>: the Low level</li>
     * <li><strong>level60</strong>: the Normal level</li>
     * <li><strong>level90</strong>: the Strict level</li>
     * </ul>
     * </li>
     * <li><p><strong>AiMode</strong>: the mode of the Intelligent Protection policy. This field is required and must be of the string type. Valid values:</p>
     * <ul>
     * <li><strong>watch</strong>: the Warning mode</li>
     * <li><strong>defense</strong>: the Defense mode</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AiTemplate&quot;:&quot;level60&quot;,&quot;AiMode&quot;:&quot;defense&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for a domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
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
