// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectModeRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Domain")
    public String domain;

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
