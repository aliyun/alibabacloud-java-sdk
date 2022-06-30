// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Regions")
    public java.util.List<String> regions;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyWebAreaBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockRequest self = new ModifyWebAreaBlockRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebAreaBlockRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public ModifyWebAreaBlockRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
