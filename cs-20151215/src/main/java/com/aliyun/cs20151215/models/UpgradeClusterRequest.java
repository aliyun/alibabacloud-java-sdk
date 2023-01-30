// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterRequest extends TeaModel {
    @NameInMap("component_name")
    @Deprecated
    public String componentName;

    @NameInMap("master_only")
    public Boolean masterOnly;

    @NameInMap("next_version")
    public String nextVersion;

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
