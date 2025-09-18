// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    /**
     * <p>The list of component information.</p>
     */
    @NameInMap("Components")
    public java.util.List<Components> components;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FFAC608A-5DC3-174F-93C6-9F88CA6D5875</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOX</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The list of attributes.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<Attribute> attributes;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOX</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The total number of instances on which the component is installed.</p>
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
