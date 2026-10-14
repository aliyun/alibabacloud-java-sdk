// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCustomPortsRequest extends TeaModel {
    /**
     * <p>The resource group ID of the Anti-DDoS Proxy instance in Resource Management. The default value is empty, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebCustomPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCustomPortsRequest self = new DescribeWebCustomPortsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebCustomPortsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
