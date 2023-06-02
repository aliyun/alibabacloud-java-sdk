// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCnameReusesRequest extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeCnameReusesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameReusesRequest self = new DescribeCnameReusesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCnameReusesRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeCnameReusesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
