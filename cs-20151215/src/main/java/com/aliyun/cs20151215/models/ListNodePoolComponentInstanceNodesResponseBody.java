// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentInstanceNodesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    @NameInMap("node_list")
    public java.util.List<ListNodePoolComponentInstanceNodesResponseBodyNodeList> nodeList;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("total_count")
    public Integer totalCount;

    public static ListNodePoolComponentInstanceNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentInstanceNodesResponseBody self = new ListNodePoolComponentInstanceNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentInstanceNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentInstanceNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodePoolComponentInstanceNodesResponseBody setNodeList(java.util.List<ListNodePoolComponentInstanceNodesResponseBodyNodeList> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<ListNodePoolComponentInstanceNodesResponseBodyNodeList> getNodeList() {
        return this.nodeList;
    }

    public ListNodePoolComponentInstanceNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig extends TeaModel {
        @NameInMap("custom_config")
        public java.util.Map<String, ?> customConfig;

        public static ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig build(java.util.Map<String, ?> map) throws Exception {
            ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig self = new ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig();
            return TeaModel.build(map, self);
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig setCustomConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

    }

    public static class ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent extends TeaModel {
        @NameInMap("config")
        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig config;

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
         * <p>1.28.9-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent build(java.util.Map<String, ?> map) throws Exception {
            ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent self = new ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent();
            return TeaModel.build(map, self);
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent setConfig(ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig config) {
            this.config = config;
            return this;
        }
        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponentConfig getConfig() {
            return this.config;
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent setConfigRevision(String configRevision) {
            this.configRevision = configRevision;
            return this;
        }
        public String getConfigRevision() {
            return this.configRevision;
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListNodePoolComponentInstanceNodesResponseBodyNodeList extends TeaModel {
        @NameInMap("component")
        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent component;

        /**
         * <strong>example:</strong>
         * <p>i-bp1xxxxx</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou.10.91.xx.xx</p>
         */
        @NameInMap("node_name")
        public String nodeName;

        public static ListNodePoolComponentInstanceNodesResponseBodyNodeList build(java.util.Map<String, ?> map) throws Exception {
            ListNodePoolComponentInstanceNodesResponseBodyNodeList self = new ListNodePoolComponentInstanceNodesResponseBodyNodeList();
            return TeaModel.build(map, self);
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeList setComponent(ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent component) {
            this.component = component;
            return this;
        }
        public ListNodePoolComponentInstanceNodesResponseBodyNodeListComponent getComponent() {
            return this.component;
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNodePoolComponentInstanceNodesResponseBodyNodeList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
