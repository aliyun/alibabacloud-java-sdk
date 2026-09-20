// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMultiZoneClusterRequest extends TeaModel {
    /**
     * <p>The ID of the multi-zone instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-***************</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The component names. You can specify multiple component names separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LINDORM</p>
     */
    @NameInMap("Components")
    public String components;

    /**
     * <p>The names of the components that need to be restarted after the upgrade. You can specify multiple component names separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>LPROXY</p>
     */
    @NameInMap("RestartComponents")
    public String restartComponents;

    /**
     * <p>The execution mode. If UpgradeInsName is not empty, the mode is forcibly set to single. If UpgradeInsName is empty and RunMode is not specified, the default value is serial. Valid values:</p>
     * <ul>
     * <li>serial: all sub-instances are upgraded.</li>
     * <li>single: only the specified sub-instance is upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serial</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>The name of the sub-instance to upgrade. You can obtain this value from the MultiZoneInstanceModels field in the response of the <a href="~~DescribeMultiZoneCluster~~">DescribeMultiZoneCluster</a> operation. This parameter is optional. If you do not specify this parameter, all sub-instances are upgraded.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-t4n40m3171t4******-az-b</p>
     */
    @NameInMap("UpgradeInsName")
    public String upgradeInsName;

    /**
     * <p>The RPM version to upgrade to. If you do not specify this parameter, the components are upgraded to the latest version. If you specify multiple values for Components, you must also specify the same number of values for Versions, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>t-apsara-lindorm-2.1.20-20200518175539.alios7.x86_64</p>
     */
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
