// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMultiZoneClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Components")
    public String components;

    @NameInMap("RestartComponents")
    public String restartComponents;

    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("UpgradeInsName")
    public String upgradeInsName;

    @NameInMap("Versions")
    public String versions;

    public static UpgradeMultiZoneClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMultiZoneClusterRequest self = new UpgradeMultiZoneClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeMultiZoneClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpgradeMultiZoneClusterRequest setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

    public UpgradeMultiZoneClusterRequest setRestartComponents(String restartComponents) {
        this.restartComponents = restartComponents;
        return this;
    }
    public String getRestartComponents() {
        return this.restartComponents;
    }

    public UpgradeMultiZoneClusterRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public UpgradeMultiZoneClusterRequest setUpgradeInsName(String upgradeInsName) {
        this.upgradeInsName = upgradeInsName;
        return this;
    }
    public String getUpgradeInsName() {
        return this.upgradeInsName;
    }

    public UpgradeMultiZoneClusterRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
