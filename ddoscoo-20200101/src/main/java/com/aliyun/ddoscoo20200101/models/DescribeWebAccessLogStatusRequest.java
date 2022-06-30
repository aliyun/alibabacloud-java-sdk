// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebAccessLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogStatusRequest self = new DescribeWebAccessLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebAccessLogStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
