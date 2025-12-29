// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateNodePoolComponentRequest extends TeaModel {
    @NameInMap("config")
    public UpdateNodePoolComponentRequestConfig config;

    @NameInMap("disableRolling")
    public Boolean disableRolling;

    /**
     * <strong>example:</strong>
     * <p>kubelet</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nodeNames")
    public java.util.List<String> nodeNames;

    @NameInMap("rollingPolicy")
    public UpdateNodePoolComponentRequestRollingPolicy rollingPolicy;

    /**
     * <strong>example:</strong>
     * <p>1.28.9-aliyun.1</p>
     */
    @NameInMap("version")
    public String version;

    public static UpdateNodePoolComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodePoolComponentRequest self = new UpdateNodePoolComponentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodePoolComponentRequest setConfig(UpdateNodePoolComponentRequestConfig config) {
        this.config = config;
        return this;
    }
    public UpdateNodePoolComponentRequestConfig getConfig() {
        return this.config;
    }

    public UpdateNodePoolComponentRequest setDisableRolling(Boolean disableRolling) {
        this.disableRolling = disableRolling;
        return this;
    }
    public Boolean getDisableRolling() {
        return this.disableRolling;
    }

    public UpdateNodePoolComponentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateNodePoolComponentRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public UpdateNodePoolComponentRequest setRollingPolicy(UpdateNodePoolComponentRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public UpdateNodePoolComponentRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public UpdateNodePoolComponentRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class UpdateNodePoolComponentRequestConfig extends TeaModel {
        @NameInMap("customConfig")
        public java.util.Map<String, String> customConfig;

        public static UpdateNodePoolComponentRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodePoolComponentRequestConfig self = new UpdateNodePoolComponentRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateNodePoolComponentRequestConfig setCustomConfig(java.util.Map<String, String> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class UpdateNodePoolComponentRequestRollingPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("batchInterval")
        public Long batchInterval;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxParallelism")
        public Long maxParallelism;

        /**
         * <strong>example:</strong>
         * <p>NotPause</p>
         */
        @NameInMap("pausePolicy")
        public String pausePolicy;

        public static UpdateNodePoolComponentRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodePoolComponentRequestRollingPolicy self = new UpdateNodePoolComponentRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateNodePoolComponentRequestRollingPolicy setBatchInterval(Long batchInterval) {
            this.batchInterval = batchInterval;
            return this;
        }
        public Long getBatchInterval() {
            return this.batchInterval;
        }

        public UpdateNodePoolComponentRequestRollingPolicy setMaxParallelism(Long maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public UpdateNodePoolComponentRequestRollingPolicy setPausePolicy(String pausePolicy) {
            this.pausePolicy = pausePolicy;
            return this;
        }
        public String getPausePolicy() {
            return this.pausePolicy;
        }

    }

}
