// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentInstancesResponseBody extends TeaModel {
    @NameInMap("component_instances")
    public java.util.List<ListNodePoolComponentInstancesResponseBodyComponentInstances> componentInstances;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    public static ListNodePoolComponentInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentInstancesResponseBody self = new ListNodePoolComponentInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentInstancesResponseBody setComponentInstances(java.util.List<ListNodePoolComponentInstancesResponseBodyComponentInstances> componentInstances) {
        this.componentInstances = componentInstances;
        return this;
    }
    public java.util.List<ListNodePoolComponentInstancesResponseBodyComponentInstances> getComponentInstances() {
        return this.componentInstances;
    }

    public ListNodePoolComponentInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
         */
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

        public static ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig build(java.util.Map<String, ?> map) throws Exception {
            ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig self = new ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig();
            return TeaModel.build(map, self);
        }

        public ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class ListNodePoolComponentInstancesResponseBodyComponentInstances extends TeaModel {
        @NameInMap("config")
        public ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig config;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("config_revision")
        public String configRevision;

        /**
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1.33.3-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListNodePoolComponentInstancesResponseBodyComponentInstances build(java.util.Map<String, ?> map) throws Exception {
            ListNodePoolComponentInstancesResponseBodyComponentInstances self = new ListNodePoolComponentInstancesResponseBodyComponentInstances();
            return TeaModel.build(map, self);
        }

        public ListNodePoolComponentInstancesResponseBodyComponentInstances setConfig(ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig config) {
            this.config = config;
            return this;
        }
        public ListNodePoolComponentInstancesResponseBodyComponentInstancesConfig getConfig() {
            return this.config;
        }

        public ListNodePoolComponentInstancesResponseBodyComponentInstances setConfigRevision(String configRevision) {
            this.configRevision = configRevision;
            return this;
        }
        public String getConfigRevision() {
            return this.configRevision;
        }

        public ListNodePoolComponentInstancesResponseBodyComponentInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodePoolComponentInstancesResponseBodyComponentInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListNodePoolComponentInstancesResponseBodyComponentInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
