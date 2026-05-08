// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallNodePoolComponentsRequest extends TeaModel {
    /**
     * <p>A list of node components to be installed.</p>
     */
    @NameInMap("components")
    public java.util.List<InstallNodePoolComponentsRequestComponents> components;

    /**
     * <p>A list of specific node names where the component should be installed. If not specified, the component will be installed on all nodes in the node pool.</p>
     */
    @NameInMap("nodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>Configuration for the rolling update process.</p>
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
         * <p>Custom parameters for the component.</p>
         */
        @NameInMap("customConfig")
        public java.util.Map<String, String> customConfig;

        public static InstallNodePoolComponentsRequestComponentsConfig build(java.util.Map<String, ?> map) throws Exception {
            InstallNodePoolComponentsRequestComponentsConfig self = new InstallNodePoolComponentsRequestComponentsConfig();
            return TeaModel.build(map, self);
        }

        public InstallNodePoolComponentsRequestComponentsConfig setCustomConfig(java.util.Map<String, String> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class InstallNodePoolComponentsRequestComponents extends TeaModel {
        /**
         * <p>The configuration details for the component.</p>
         */
        @NameInMap("config")
        public InstallNodePoolComponentsRequestComponentsConfig config;

        /**
         * <p>The name of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the component.</p>
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
         * <p>The time interval between update batches, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("batchInterval")
        public Long batchInterval;

        /**
         * <p>The maximum number of nodes that can be updated concurrently in each batch. Default: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxParallelism")
        public Long maxParallelism;

        /**
         * <p>The strategy for automatic pausing during the update process. Valid values: NotPause, FirstBatchPause, EveryBatchPause.</p>
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
