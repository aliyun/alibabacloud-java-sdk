// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("filterRegionIds")
    public String filterRegionIds;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rw-00001,rw-00002,rw-00003</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("prometheusInstanceIds")
    public String prometheusInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2bhocin5e2na</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Prometheus</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("tag")
    public java.util.List<ListPrometheusInstancesRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>V2</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("version")
    public String version;

    public static ListPrometheusInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesRequest self = new ListPrometheusInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesRequest setFilterRegionIds(String filterRegionIds) {
        this.filterRegionIds = filterRegionIds;
        return this;
    }
    public String getFilterRegionIds() {
        return this.filterRegionIds;
    }

    public ListPrometheusInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusInstancesRequest setPrometheusInstanceIds(String prometheusInstanceIds) {
        this.prometheusInstanceIds = prometheusInstanceIds;
        return this;
    }
    public String getPrometheusInstanceIds() {
        return this.prometheusInstanceIds;
    }

    public ListPrometheusInstancesRequest setPrometheusInstanceName(String prometheusInstanceName) {
        this.prometheusInstanceName = prometheusInstanceName;
        return this;
    }
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
    }

    public ListPrometheusInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPrometheusInstancesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListPrometheusInstancesRequest setTag(java.util.List<ListPrometheusInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListPrometheusInstancesRequestTag> getTag() {
        return this.tag;
    }

    public ListPrometheusInstancesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ListPrometheusInstancesRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("value")
        public String value;

        public static ListPrometheusInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstancesRequestTag self = new ListPrometheusInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
