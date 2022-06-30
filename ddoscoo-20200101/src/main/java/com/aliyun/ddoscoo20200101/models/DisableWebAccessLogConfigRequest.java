// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebAccessLogConfigRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DisableWebAccessLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableWebAccessLogConfigRequest self = new DisableWebAccessLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DisableWebAccessLogConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DisableWebAccessLogConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
