// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TargetVersion")
    public String targetVersion;

    @NameInMap("RegionId")
    public String regionId;

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

    public UpgradeInstanceVersionRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public UpgradeInstanceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
