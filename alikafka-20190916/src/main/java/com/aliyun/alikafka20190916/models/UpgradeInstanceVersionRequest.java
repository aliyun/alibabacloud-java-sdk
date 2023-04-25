// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The major version to be upgraded to. Valid values:</p>
     * <br>
     * <p>*   **0.10.2**</p>
     * <p>*   **2.2.0**</p>
     * <br>
     * <p>If you set this parameter to the current major version, the system upgrades the instance to the latest minor version.</p>
     */
    @NameInMap("TargetVersion")
    public String targetVersion;

    public static UpgradeInstanceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionRequest self = new UpgradeInstanceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeInstanceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeInstanceVersionRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
