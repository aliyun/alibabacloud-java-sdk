// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountRequest extends TeaModel {
    /**
     * <p>DescribeExcpetionCount</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Queries the number of assets that are in an abnormal state and the number of Anti-DDoS Origin instances that are about to expire in a specific region.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeExcpetionCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountRequest self = new DescribeExcpetionCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExcpetionCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeExcpetionCountRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
