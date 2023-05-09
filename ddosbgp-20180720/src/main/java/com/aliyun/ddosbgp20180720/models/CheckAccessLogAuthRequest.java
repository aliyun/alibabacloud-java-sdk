// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckAccessLogAuthRequest extends TeaModel {
    /**
     * <p>Indicates whether Anti-DDoS Origin was authorized to access Log Service. Valid values:</p>
     * <br>
     * <p>*   **true**: Anti-DDoS Origin was authorized.</p>
     * <p>*   **false**: Anti-DDoS Origin was not authorized.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
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
