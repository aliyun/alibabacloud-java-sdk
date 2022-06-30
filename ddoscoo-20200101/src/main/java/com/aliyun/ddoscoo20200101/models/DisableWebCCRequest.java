// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebCCRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DisableWebCCRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableWebCCRequest self = new DisableWebCCRequest();
        return TeaModel.build(map, self);
    }

    public DisableWebCCRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DisableWebCCRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
