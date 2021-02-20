// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlackholeCountRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeUnBlackholeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnBlackholeCountRequest self = new DescribeUnBlackholeCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnBlackholeCountRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUnBlackholeCountRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
