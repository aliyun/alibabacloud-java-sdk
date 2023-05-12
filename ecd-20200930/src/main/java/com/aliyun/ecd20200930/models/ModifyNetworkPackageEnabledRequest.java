// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageEnabledRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the Internet access package.</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The operation that you want to perform. Set the value to ModifyNetworkPackageEnabled.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyNetworkPackageEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageEnabledRequest self = new ModifyNetworkPackageEnabledRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageEnabledRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyNetworkPackageEnabledRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public ModifyNetworkPackageEnabledRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
