// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateNodePoolComponentInstanceRequest extends TeaModel {
    /**
     * <p>The node component configuration.</p>
     */
    @NameInMap("config")
    public UpdateNodePoolComponentInstanceRequestConfig config;

    /**
     * <p>Specifies whether to disable rolling updates. Default value: false. Updating the baseline configuration triggers a rolling update of the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_rolling")
    public Boolean disableRolling;

    /**
     * <p>The list of nodes to be updated in a rolling manner. Default value: all nodes.</p>
     */
    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    /**
     * <p>The rolling update configuration.</p>
     */
    @NameInMap("rolling_policy")
    public UpdateNodePoolComponentInstanceRequestRollingPolicy rollingPolicy;

    /**
     * <p>The node component version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.33.3-aliyun.1</p>
     */
    @NameInMap("version")
    public String version;

    public static UpdateNodePoolComponentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodePoolComponentInstanceRequest self = new UpdateNodePoolComponentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodePoolComponentInstanceRequest setConfig(UpdateNodePoolComponentInstanceRequestConfig config) {
        this.config = config;
        return this;
    }
    public UpdateNodePoolComponentInstanceRequestConfig getConfig() {
        return this.config;
    }

    public UpdateNodePoolComponentInstanceRequest setDisableRolling(Boolean disableRolling) {
        this.disableRolling = disableRolling;
        return this;
    }
    public Boolean getDisableRolling() {
        return this.disableRolling;
    }

    public UpdateNodePoolComponentInstanceRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public UpdateNodePoolComponentInstanceRequest setRollingPolicy(UpdateNodePoolComponentInstanceRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public UpdateNodePoolComponentInstanceRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public UpdateNodePoolComponentInstanceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class UpdateNodePoolComponentInstanceRequestConfigEnvs extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateNodePoolComponentInstanceRequestConfigEnvs build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodePoolComponentInstanceRequestConfigEnvs self = new UpdateNodePoolComponentInstanceRequestConfigEnvs();
            return TeaModel.build(map, self);
        }

        public UpdateNodePoolComponentInstanceRequestConfigEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateNodePoolComponentInstanceRequestConfigEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateNodePoolComponentInstanceRequestConfig extends TeaModel {
        /**
         * <p>The custom configuration of the node component.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

        /**
         * <p>The environment variables of the node component.</p>
         */
        @NameInMap("envs")
        public java.util.List<UpdateNodePoolComponentInstanceRequestConfigEnvs> envs;

        public static UpdateNodePoolComponentInstanceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodePoolComponentInstanceRequestConfig self = new UpdateNodePoolComponentInstanceRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateNodePoolComponentInstanceRequestConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public UpdateNodePoolComponentInstanceRequestConfig setEnvs(java.util.List<UpdateNodePoolComponentInstanceRequestConfigEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<UpdateNodePoolComponentInstanceRequestConfigEnvs> getEnvs() {
            return this.envs;
        }

    }

    public static class UpdateNodePoolComponentInstanceRequestRollingPolicy extends TeaModel {
        /**
         * <p>The upgrade interval between batches, in seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("batch_interval")
        public Long batchInterval;

        /**
         * <p>The maximum number of nodes allowed to fail during the rolling update. Default value: 0. A value of 0 indicates that the task fails if any node fails. A value greater than 0 indicates that the task fails and stops if the cumulative number of failed nodes exceeds this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("max_failed_nodes")
        public Long maxFailedNodes;

        /**
         * <p>The maximum number of parallel nodes per batch. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_parallelism")
        public Long maxParallelism;

        /**
         * <p>The automatic pause policy during node upgrades. Valid values: NotPause, FirstBatch, and EveryBatch. Default value: NotPause.</p>
         * 
         * <strong>example:</strong>
         * <p>NotPause</p>
         */
        @NameInMap("pause_policy")
        public String pausePolicy;

        public static UpdateNodePoolComponentInstanceRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodePoolComponentInstanceRequestRollingPolicy self = new UpdateNodePoolComponentInstanceRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateNodePoolComponentInstanceRequestRollingPolicy setBatchInterval(Long batchInterval) {
            this.batchInterval = batchInterval;
            return this;
        }
        public Long getBatchInterval() {
            return this.batchInterval;
        }

        public UpdateNodePoolComponentInstanceRequestRollingPolicy setMaxFailedNodes(Long maxFailedNodes) {
            this.maxFailedNodes = maxFailedNodes;
            return this;
        }
        public Long getMaxFailedNodes() {
            return this.maxFailedNodes;
        }

        public UpdateNodePoolComponentInstanceRequestRollingPolicy setMaxParallelism(Long maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public UpdateNodePoolComponentInstanceRequestRollingPolicy setPausePolicy(String pausePolicy) {
            this.pausePolicy = pausePolicy;
            return this;
        }
        public String getPausePolicy() {
            return this.pausePolicy;
        }

    }

}
