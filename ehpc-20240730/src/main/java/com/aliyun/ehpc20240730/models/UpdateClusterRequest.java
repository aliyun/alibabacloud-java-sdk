// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto scale-out for the cluster. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.1.0</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>Specifies whether to enable auto scale-in for the cluster. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     */
    @NameInMap("ClusterCustomConfiguration")
    public UpdateClusterRequestClusterCustomConfiguration clusterCustomConfiguration;

    /**
     * <p>The URL that is used to download the post-processing script.</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-serverless-cluster-20240805</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>The client version. By default, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The post-processing script of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>slurm22.05.8-serverless-cluster-20240805</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The idle duration of the compute nodes allowed by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <p>The scheduler specifications of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GrowInterval")
    public Integer growInterval;

    /**
     * <p>Specifies whether to enable the topology awareness feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IdleInterval")
    public Integer idleInterval;

    /**
     * <p>The interval at which the cluster is automatically scaled out.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxCoreCount")
    public Integer maxCoreCount;

    /**
     * <p>The arguments that are used to run the post-processing script.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    /**
     * <p>The monitoring details of the cluster.</p>
     */
    @NameInMap("MonitorSpec")
    public UpdateClusterRequestMonitorSpec monitorSpec;

    /**
     * <p>The scheduler specifications of the cluster.</p>
     */
    @NameInMap("SchedulerSpec")
    public UpdateClusterRequestSchedulerSpec schedulerSpec;

    public static UpdateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterRequest self = new UpdateClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UpdateClusterRequest setClusterCustomConfiguration(UpdateClusterRequestClusterCustomConfiguration clusterCustomConfiguration) {
        this.clusterCustomConfiguration = clusterCustomConfiguration;
        return this;
    }
    public UpdateClusterRequestClusterCustomConfiguration getClusterCustomConfiguration() {
        return this.clusterCustomConfiguration;
    }

    public UpdateClusterRequest setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public UpdateClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateClusterRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public UpdateClusterRequest setEnableScaleIn(Boolean enableScaleIn) {
        this.enableScaleIn = enableScaleIn;
        return this;
    }
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    public UpdateClusterRequest setEnableScaleOut(Boolean enableScaleOut) {
        this.enableScaleOut = enableScaleOut;
        return this;
    }
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    public UpdateClusterRequest setGrowInterval(Integer growInterval) {
        this.growInterval = growInterval;
        return this;
    }
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    public UpdateClusterRequest setIdleInterval(Integer idleInterval) {
        this.idleInterval = idleInterval;
        return this;
    }
    public Integer getIdleInterval() {
        return this.idleInterval;
    }

    public UpdateClusterRequest setMaxCoreCount(Integer maxCoreCount) {
        this.maxCoreCount = maxCoreCount;
        return this;
    }
    public Integer getMaxCoreCount() {
        return this.maxCoreCount;
    }

    public UpdateClusterRequest setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }

    public UpdateClusterRequest setMonitorSpec(UpdateClusterRequestMonitorSpec monitorSpec) {
        this.monitorSpec = monitorSpec;
        return this;
    }
    public UpdateClusterRequestMonitorSpec getMonitorSpec() {
        return this.monitorSpec;
    }

    public UpdateClusterRequest setSchedulerSpec(UpdateClusterRequestSchedulerSpec schedulerSpec) {
        this.schedulerSpec = schedulerSpec;
        return this;
    }
    public UpdateClusterRequestSchedulerSpec getSchedulerSpec() {
        return this.schedulerSpec;
    }

    public static class UpdateClusterRequestClusterCustomConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the monitoring component of compute nodes. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>E-HPC cn-hangzhou</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The monitoring details of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>http://*****</p>
         */
        @NameInMap("Script")
        public String script;

        public static UpdateClusterRequestClusterCustomConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateClusterRequestClusterCustomConfiguration self = new UpdateClusterRequestClusterCustomConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateClusterRequestClusterCustomConfiguration setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public UpdateClusterRequestClusterCustomConfiguration setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class UpdateClusterRequestMonitorSpec extends TeaModel {
        /**
         * <p>Specifies whether to enable the monitoring component of compute nodes. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableComputeLoadMonitor")
        public Boolean enableComputeLoadMonitor;

        public static UpdateClusterRequestMonitorSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateClusterRequestMonitorSpec self = new UpdateClusterRequestMonitorSpec();
            return TeaModel.build(map, self);
        }

        public UpdateClusterRequestMonitorSpec setEnableComputeLoadMonitor(Boolean enableComputeLoadMonitor) {
            this.enableComputeLoadMonitor = enableComputeLoadMonitor;
            return this;
        }
        public Boolean getEnableComputeLoadMonitor() {
            return this.enableComputeLoadMonitor;
        }

    }

    public static class UpdateClusterRequestSchedulerSpec extends TeaModel {
        /**
         * <p>Specifies whether to enable the topology awareness feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTopologyAwareness")
        public Boolean enableTopologyAwareness;

        public static UpdateClusterRequestSchedulerSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateClusterRequestSchedulerSpec self = new UpdateClusterRequestSchedulerSpec();
            return TeaModel.build(map, self);
        }

        public UpdateClusterRequestSchedulerSpec setEnableTopologyAwareness(Boolean enableTopologyAwareness) {
            this.enableTopologyAwareness = enableTopologyAwareness;
            return this;
        }
        public Boolean getEnableTopologyAwareness() {
            return this.enableTopologyAwareness;
        }

    }

}
