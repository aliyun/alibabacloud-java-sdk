// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckGrantRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Anti-DDoS Origin to check the service-linked role. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsSlr")
    public Boolean isSlr;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CheckGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGrantRequest self = new CheckGrantRequest();
        return TeaModel.build(map, self);
    }

    public CheckGrantRequest setIsSlr(Boolean isSlr) {
        this.isSlr = isSlr;
        return this;
    }
    public Boolean getIsSlr() {
        return this.isSlr;
    }

    public CheckGrantRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckGrantRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
