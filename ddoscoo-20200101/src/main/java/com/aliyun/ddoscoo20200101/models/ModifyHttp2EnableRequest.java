// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHttp2EnableRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyHttp2EnableRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHttp2EnableRequest self = new ModifyHttp2EnableRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHttp2EnableRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyHttp2EnableRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public ModifyHttp2EnableRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
