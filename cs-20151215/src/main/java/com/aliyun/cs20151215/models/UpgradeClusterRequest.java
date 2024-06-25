// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterRequest extends TeaModel {
    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s</p>
     */
    @NameInMap("component_name")
    @Deprecated
    public String componentName;

    /**
     * <p>Specifies whether to update only the master nodes. Valid values:</p>
     * <ul>
     * <li>true: Updates only the master nodes.</li>
     * <li>false: Updates the master nodes and worker nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("master_only")
    public Boolean masterOnly;

    /**
     * <p>The Kubernetes version to which you want to update the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.9-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>This parameter is discontinued. Specify the Kubernetes version by using the next_version parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1.14.8-aliyun.1</p>
     */
    @NameInMap("version")
    @Deprecated
    public String version;

    public static UpgradeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterRequest self = new UpgradeClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public UpgradeClusterRequest setMasterOnly(Boolean masterOnly) {
        this.masterOnly = masterOnly;
        return this;
    }
    public Boolean getMasterOnly() {
        return this.masterOnly;
    }

    public UpgradeClusterRequest setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public String getNextVersion() {
        return this.nextVersion;
    }

    public UpgradeClusterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
