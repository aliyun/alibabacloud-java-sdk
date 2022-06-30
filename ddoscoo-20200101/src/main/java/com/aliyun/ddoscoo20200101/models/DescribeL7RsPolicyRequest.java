// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7RsPolicyRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeL7RsPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7RsPolicyRequest self = new DescribeL7RsPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeL7RsPolicyRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeL7RsPolicyRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public DescribeL7RsPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
