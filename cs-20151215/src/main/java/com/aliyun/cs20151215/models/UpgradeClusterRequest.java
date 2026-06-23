// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterRequest extends TeaModel {
    /**
     * <p>[This parameter is deprecated] No value is required.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("component_name")
    @Deprecated
    public String componentName;

    /**
     * <p>Specifies whether to upgrade only the control plane. Valid values:</p>
     * <ul>
     * <li>true: upgrades only the control plane.</li>
     * <li>false: upgrades both the control plane and worker nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("master_only")
    public Boolean masterOnly;

    /**
     * <p>The target version to which the cluster is upgraded.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("next_version")
    public String nextVersion;

    /**
     * <p>The rolling upgrade configuration.</p>
     */
    @NameInMap("rolling_policy")
    @Deprecated
    public UpgradeClusterRequestRollingPolicy rollingPolicy;

    /**
     * <p>[This parameter is deprecated] Use the <code>next_version</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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

    @Deprecated
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
         * <p>The maximum number of worker nodes that can be upgraded in parallel per batch.</p>
         * <p>During the worker node upgrade, nodes are upgraded in batches based on the specified maximum parallelism. The number of nodes upgraded in each batch increases as follows: 1, 2, 4, 8, and so on until the maximum parallelism is reached. After the maximum parallelism is reached, each subsequent batch upgrades the maximum number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("max_parallelism")
        @Deprecated
        public Integer maxParallelism;

        public static UpgradeClusterRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpgradeClusterRequestRollingPolicy self = new UpgradeClusterRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public UpgradeClusterRequestRollingPolicy setMaxParallelism(Integer maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Integer getMaxParallelism() {
            return this.maxParallelism;
        }

    }

}
