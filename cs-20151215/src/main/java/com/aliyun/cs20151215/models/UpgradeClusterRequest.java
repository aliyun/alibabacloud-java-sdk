// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. No need to pass values.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s</p>
     */
    @NameInMap("component_name")
    @Deprecated
    public String componentName;

    /**
     * <p>Specifies whether to upgrade only master nodes. Valid values:</p>
     * <ul>
     * <li>true: upgrades master nodes only.</li>
     * <li>false: upgrades both master and worker nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("master_only")
    public Boolean masterOnly;

    /**
     * <p>The target Kubernetes version for cluster upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.9-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>The rolling update configuration.</p>
     */
    @NameInMap("rolling_policy")
    public UpgradeClusterRequestRollingPolicy rollingPolicy;

    /**
     * <p>This parameter is deprecated. Use next_version to specify the upgrade target Kubernetes version.</p>
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

    @Deprecated
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

    public UpgradeClusterRequest setRollingPolicy(UpgradeClusterRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public UpgradeClusterRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    @Deprecated
    public UpgradeClusterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class UpgradeClusterRequestRollingPolicy extends TeaModel {
        /**
         * <p>The maximum number of nodes concurrently upgraded per batch.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("max_parallelism")
        public Integer maxParallelism;

        public static UpgradeClusterRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpgradeClusterRequestRollingPolicy self = new UpgradeClusterRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public UpgradeClusterRequestRollingPolicy setMaxParallelism(Integer maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Integer getMaxParallelism() {
            return this.maxParallelism;
        }

    }

}
