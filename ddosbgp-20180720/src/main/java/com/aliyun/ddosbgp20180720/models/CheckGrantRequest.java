// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckGrantRequest extends TeaModel {
    @NameInMap("IsSlr")
    public Boolean isSlr;

    /**
     * <p>WB269094</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>CheckGrant</p>
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
