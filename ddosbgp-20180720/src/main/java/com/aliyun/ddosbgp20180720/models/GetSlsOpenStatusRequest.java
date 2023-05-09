// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class GetSlsOpenStatusRequest extends TeaModel {
    /**
     * <p>Indicates whether Log Service was activated. Valid values:</p>
     * <br>
     * <p>*   **true**: Log Service was activated.</p>
     * <p>*   **false**: Log Service was not activated.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
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
