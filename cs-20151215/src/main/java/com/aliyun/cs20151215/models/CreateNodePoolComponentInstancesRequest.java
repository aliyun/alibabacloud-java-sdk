// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateNodePoolComponentInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("components")
    public java.util.List<CreateNodePoolComponentInstancesRequestComponents> components;

    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    @NameInMap("rolling_policy")
    public CreateNodePoolComponentInstancesRequestRollingPolicy rollingPolicy;

    public static CreateNodePoolComponentInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodePoolComponentInstancesRequest self = new CreateNodePoolComponentInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodePoolComponentInstancesRequest setComponents(java.util.List<CreateNodePoolComponentInstancesRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateNodePoolComponentInstancesRequestComponents> getComponents() {
        return this.components;
    }

    public CreateNodePoolComponentInstancesRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public CreateNodePoolComponentInstancesRequest setRollingPolicy(CreateNodePoolComponentInstancesRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public CreateNodePoolComponentInstancesRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static class CreateNodePoolComponentInstancesRequestComponentsConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

        public static CreateNodePoolComponentInstancesRequestComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateNodePoolComponentInstancesRequestComponentsConfig self = new CreateNodePoolComponentInstancesRequestComponentsConfig();
            return TeaModel.build(map, self);
        }

        public CreateNodePoolComponentInstancesRequestComponentsConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class CreateNodePoolComponentInstancesRequestComponents extends TeaModel {
        @NameInMap("config")
        public CreateNodePoolComponentInstancesRequestComponentsConfig config;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.33.3-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateNodePoolComponentInstancesRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateNodePoolComponentInstancesRequestComponents self = new CreateNodePoolComponentInstancesRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateNodePoolComponentInstancesRequestComponents setConfig(CreateNodePoolComponentInstancesRequestComponentsConfig config) {
            this.config = config;
            return this;
        }
        public CreateNodePoolComponentInstancesRequestComponentsConfig getConfig() {
            return this.config;
        }

        public CreateNodePoolComponentInstancesRequestComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateNodePoolComponentInstancesRequestComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateNodePoolComponentInstancesRequestRollingPolicy extends TeaModel {
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

        public static CreateNodePoolComponentInstancesRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateNodePoolComponentInstancesRequestRollingPolicy self = new CreateNodePoolComponentInstancesRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public CreateNodePoolComponentInstancesRequestRollingPolicy setBatchInterval(Long batchInterval) {
            this.batchInterval = batchInterval;
            return this;
        }
        public Long getBatchInterval() {
            return this.batchInterval;
        }

        public CreateNodePoolComponentInstancesRequestRollingPolicy setMaxFailedNodes(Long maxFailedNodes) {
            this.maxFailedNodes = maxFailedNodes;
            return this;
        }
        public Long getMaxFailedNodes() {
            return this.maxFailedNodes;
        }

        public CreateNodePoolComponentInstancesRequestRollingPolicy setMaxParallelism(Long maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public CreateNodePoolComponentInstancesRequestRollingPolicy setPausePolicy(String pausePolicy) {
            this.pausePolicy = pausePolicy;
            return this;
        }
        public String getPausePolicy() {
            return this.pausePolicy;
        }

    }

}
