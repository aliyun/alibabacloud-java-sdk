// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersRequest extends TeaModel {
    @NameInMap("CustomHeaders")
    public String customHeaders;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHeadersRequest self = new ModifyHeadersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHeadersRequest setCustomHeaders(String customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }
    public String getCustomHeaders() {
        return this.customHeaders;
    }

    public ModifyHeadersRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyHeadersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
