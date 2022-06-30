// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheSwitchRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Integer enable;

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
