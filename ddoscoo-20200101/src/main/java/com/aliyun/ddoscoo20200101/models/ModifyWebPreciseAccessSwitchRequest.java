// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessSwitchRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Domain")
    public String domain;

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
