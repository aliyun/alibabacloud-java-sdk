// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCcProtectSwitchRequest extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebCcProtectSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCcProtectSwitchRequest self = new DescribeWebCcProtectSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebCcProtectSwitchRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeWebCcProtectSwitchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
