// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallNodePoolComponentsRequest extends TeaModel {
    /**
     * <p>The list of node components.</p>
     */
    @NameInMap("components")
    public java.util.List<InstallNodePoolComponentsRequestComponents> components;

    /**
     * <p>The list of node names for the rolling operation. Default value: all nodes.</p>
     */
    @NameInMap("nodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>The rolling policy configuration.</p>
     */
    @NameInMap("rollingPolicy")
    public InstallNodePoolComponentsRequestRollingPolicy rollingPolicy;

    public static InstallNodePoolComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallNodePoolComponentsRequest self = new InstallNodePoolComponentsRequest();
        return TeaModel.build(map, self);
    }

    public InstallNodePoolComponentsRequest setComponents(java.util.List<InstallNodePoolComponentsRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<InstallNodePoolComponentsRequestComponents> getComponents() {
        return this.components;
    }

    public InstallNodePoolComponentsRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public InstallNodePoolComponentsRequest setRollingPolicy(InstallNodePoolComponentsRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public InstallNodePoolComponentsRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static class InstallNodePoolComponentsRequestComponentsConfig extends TeaModel {
        /**
         * <p>The custom configuration of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("customConfig")
        public java.util.Map<String, ?> customConfig;

        public static InstallNodePoolComponentsRequestComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            InstallNodePoolComponentsRequestComponentsConfig self = new InstallNodePoolComponentsRequestComponentsConfig();
            return TeaModel.build(map, self);
        }

        public InstallNodePoolComponentsRequestComponentsConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class InstallNodePoolComponentsRequestComponents extends TeaModel {
        /**
         * <p>The component configuration.</p>
         */
        @NameInMap("config")
        public InstallNodePoolComponentsRequestComponentsConfig config;

        /**
         * <p>The component name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.28.9-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        public static InstallNodePoolComponentsRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            InstallNodePoolComponentsRequestComponents self = new InstallNodePoolComponentsRequestComponents();
            return TeaModel.build(map, self);
        }

        public InstallNodePoolComponentsRequestComponents setConfig(InstallNodePoolComponentsRequestComponentsConfig config) {
            this.config = config;
            return this;
        }
        public InstallNodePoolComponentsRequestComponentsConfig getConfig() {
            return this.config;
        }

        public InstallNodePoolComponentsRequestComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallNodePoolComponentsRequestComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class InstallNodePoolComponentsRequestRollingPolicy extends TeaModel {
        /**
         * <p>The upgrade interval between batches. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("batchInterval")
        public Long batchInterval;

        /**
         * <p>The maximum number of nodes that are allowed to fail during the rolling process. Default value: 0, which indicates that the task fails if any node fails. If the value is greater than 0, the task fails and stops when the cumulative number of failed nodes exceeds this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("maxFailedNodes")
        public Long maxFailedNodes;

        /**
         * <p>The maximum number of parallel operations per batch. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxParallelism")
        public Long maxParallelism;

        /**
         * <p>The automatic pause policy during the node upgrade process.</p>
         * 
         * <strong>example:</strong>
         * <p>NotPause</p>
         */
        @NameInMap("pausePolicy")
        public String pausePolicy;

        public static InstallNodePoolComponentsRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            InstallNodePoolComponentsRequestRollingPolicy self = new InstallNodePoolComponentsRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public InstallNodePoolComponentsRequestRollingPolicy setBatchInterval(Long batchInterval) {
            this.batchInterval = batchInterval;
            return this;
        }
        public Long getBatchInterval() {
            return this.batchInterval;
        }

        public InstallNodePoolComponentsRequestRollingPolicy setMaxFailedNodes(Long maxFailedNodes) {
            this.maxFailedNodes = maxFailedNodes;
            return this;
        }
        public Long getMaxFailedNodes() {
            return this.maxFailedNodes;
        }

        public InstallNodePoolComponentsRequestRollingPolicy setMaxParallelism(Long maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public InstallNodePoolComponentsRequestRollingPolicy setPausePolicy(String pausePolicy) {
            this.pausePolicy = pausePolicy;
            return this;
        }
        public String getPausePolicy() {
            return this.pausePolicy;
        }

    }

}
