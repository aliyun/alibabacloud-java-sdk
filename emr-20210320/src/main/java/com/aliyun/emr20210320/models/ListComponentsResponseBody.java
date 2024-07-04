// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("Components")
    public java.util.List<Components> components;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponseBody self = new ListComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponseBody setComponents(java.util.List<Components> components) {
        this.components = components;
        return this;
    }
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    public ListComponentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComponentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Components extends TeaModel {
        /**
         * <p>应用名称。</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>属性列表。</p>
         */
        @NameInMap("Attributes")
        public java.util.List<Attribute> attributes;

        /**
         * <p>组件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>DataNode</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>命名空间。</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>安装该组件的机器总数。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replica")
        public Integer replica;

        public static Components build(java.util.Map<String, ?> map) throws Exception {
            Components self = new Components();
            return TeaModel.build(map, self);
        }

        public Components setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Components setAttributes(java.util.List<Attribute> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<Attribute> getAttributes() {
            return this.attributes;
        }

        public Components setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public Components setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public Components setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

}
