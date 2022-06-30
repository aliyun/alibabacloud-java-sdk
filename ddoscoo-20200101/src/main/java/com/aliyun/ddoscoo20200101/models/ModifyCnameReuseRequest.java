// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyCnameReuseRequest extends TeaModel {
    @NameInMap("Cname")
    public String cname;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyCnameReuseRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCnameReuseRequest self = new ModifyCnameReuseRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCnameReuseRequest setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public ModifyCnameReuseRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyCnameReuseRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public ModifyCnameReuseRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
