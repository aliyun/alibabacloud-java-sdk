// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageEnabledRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    public String networkPackageId;

    @NameInMap("Enabled")
    public Boolean enabled;

    public static ModifyNetworkPackageEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageEnabledRequest self = new ModifyNetworkPackageEnabledRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageEnabledRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNetworkPackageEnabledRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public ModifyNetworkPackageEnabledRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
