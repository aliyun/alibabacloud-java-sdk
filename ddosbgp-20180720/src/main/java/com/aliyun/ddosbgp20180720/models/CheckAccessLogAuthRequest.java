// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckAccessLogAuthRequest extends TeaModel {
    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <br>
     * <p>For more information about the valid values of this parameter, see [Regions and zones](~~188196~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. This parameter is empty by default, which indicates that the Anti-DDoS Origin instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](~~94485~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CheckAccessLogAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccessLogAuthRequest self = new CheckAccessLogAuthRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccessLogAuthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckAccessLogAuthRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
