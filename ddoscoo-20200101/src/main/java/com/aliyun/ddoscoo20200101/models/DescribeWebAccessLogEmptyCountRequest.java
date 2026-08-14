// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogEmptyCountRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebAccessLogEmptyCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogEmptyCountRequest self = new DescribeWebAccessLogEmptyCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogEmptyCountRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
