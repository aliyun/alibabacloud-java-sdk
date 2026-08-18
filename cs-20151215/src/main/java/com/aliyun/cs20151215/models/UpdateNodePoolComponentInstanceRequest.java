// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateNodePoolComponentInstanceRequest extends TeaModel {
    @NameInMap("config")
    public UpdateNodePoolComponentInstanceRequestConfig config;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_rolling")
    public Boolean disableRolling;

    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    @NameInMap("rolling_policy")
    public UpdateNodePoolComponentInstanceRequestRollingPolicy rollingPolicy;

    /**
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

    public static class UpdateNodePoolComponentInstanceRequestConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

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

    }

    public static class UpdateNodePoolComponentInstanceRequestRollingPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("batch_interval")
        public Long batchInterval;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("max_failed_nodes")
        public Long maxFailedNodes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_parallelism")
        public Long maxParallelism;

        /**
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
