// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectModeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Config")
    public String config;

    public static ModifyWebAIProtectModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectModeRequest self = new ModifyWebAIProtectModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWebAIProtectModeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebAIProtectModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebAIProtectModeRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
