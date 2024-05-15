// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class GetSlsOpenStatusRequest extends TeaModel {
    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <br>
     * <p>For more information about the valid values of this parameter, see [Regions and zones](https://help.aliyun.com/document_detail/188196.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. This parameter is empty by default, which indicates that the Anti-DDoS Origin instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](https://help.aliyun.com/document_detail/94485.html).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetSlsOpenStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSlsOpenStatusRequest self = new GetSlsOpenStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSlsOpenStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSlsOpenStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
