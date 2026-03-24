// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. If this parameter is empty, it means you have reached the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>7-b81a-4bc9-bbfa-a50cc6988667</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekxxzuad5zzzz</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The application service name.</p>
     * 
     * <strong>example:</strong>
     * <p>app-demo</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The service type.</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>An array of tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("tags")
    public java.util.List<ListServicesRequestTags> tags;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServicesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListServicesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListServicesRequest setTags(java.util.List<ListServicesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListServicesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListServicesRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>evn</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("value")
        public String value;

        public static ListServicesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestTags self = new ListServicesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServicesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
