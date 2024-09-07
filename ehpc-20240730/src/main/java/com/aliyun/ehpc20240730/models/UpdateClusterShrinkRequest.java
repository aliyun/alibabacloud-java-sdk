// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateClusterShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ClusterCustomConfiguration")
    public String clusterCustomConfigurationShrink;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-serverless-cluster-20240805</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>slurm22.05.8-serverless-cluster-20240805</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GrowInterval")
    public Integer growInterval;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IdleInterval")
    public Integer idleInterval;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public Integer maxCoreCount;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    public static UpdateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterShrinkRequest self = new UpdateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterShrinkRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UpdateClusterShrinkRequest setClusterCustomConfigurationShrink(String clusterCustomConfigurationShrink) {
        this.clusterCustomConfigurationShrink = clusterCustomConfigurationShrink;
        return this;
    }
    public String getClusterCustomConfigurationShrink() {
        return this.clusterCustomConfigurationShrink;
    }

    public UpdateClusterShrinkRequest setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public UpdateClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateClusterShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public UpdateClusterShrinkRequest setEnableScaleIn(Boolean enableScaleIn) {
        this.enableScaleIn = enableScaleIn;
        return this;
    }
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    public UpdateClusterShrinkRequest setEnableScaleOut(Boolean enableScaleOut) {
        this.enableScaleOut = enableScaleOut;
        return this;
    }
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    public UpdateClusterShrinkRequest setGrowInterval(Integer growInterval) {
        this.growInterval = growInterval;
        return this;
    }
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    public UpdateClusterShrinkRequest setIdleInterval(Integer idleInterval) {
        this.idleInterval = idleInterval;
        return this;
    }
    public Integer getIdleInterval() {
        return this.idleInterval;
    }

    public UpdateClusterShrinkRequest setMaxCoreCount(Integer maxCoreCount) {
        this.maxCoreCount = maxCoreCount;
        return this;
    }
    public Integer getMaxCoreCount() {
        return this.maxCoreCount;
    }

    public UpdateClusterShrinkRequest setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }

}
