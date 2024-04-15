// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageEnabledRequest extends TeaModel {
    /**
     * <p>Specifies whether to restore the premium bandwidth plan of the cloud computer.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the premium bandwidth plan.</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
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
