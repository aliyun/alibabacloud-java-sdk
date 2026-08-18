// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentsResponseBody extends TeaModel {
    @NameInMap("components")
    public java.util.List<ListNodePoolComponentsResponseBodyComponents> components;

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

    public static ListNodePoolComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentsResponseBody self = new ListNodePoolComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentsResponseBody setComponents(java.util.List<ListNodePoolComponentsResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<ListNodePoolComponentsResponseBodyComponents> getComponents() {
        return this.components;
    }

    public ListNodePoolComponentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListNodePoolComponentsResponseBodyComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;$schema\&quot;: \&quot;\&quot;,\&quot;properties\&quot;: {}&quot;</p>
         */
        @NameInMap("config_schema")
        public String configSchema;

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

        public static ListNodePoolComponentsResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            ListNodePoolComponentsResponseBodyComponents self = new ListNodePoolComponentsResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public ListNodePoolComponentsResponseBodyComponents setConfigSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public String getConfigSchema() {
            return this.configSchema;
        }

        public ListNodePoolComponentsResponseBodyComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodePoolComponentsResponseBodyComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
