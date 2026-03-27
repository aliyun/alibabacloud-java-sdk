// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusViewsRequest extends TeaModel {
    /**
     * <p>Filter by RegionID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou,cn-beijing</p>
     */
    @NameInMap("filterRegionIds")
    public String filterRegionIds;

    /**
     * <p>Maximum number of records to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Query token.</p>
     * 
     * <strong>example:</strong>
     * <p>44ANBjKZmQeKnaB1fXRq06w7sFYK3MUcCALMD9qQbmEiE</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>List of Prometheus view instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>view-xxx</p>
     */
    @NameInMap("prometheusViewIds")
    public String prometheusViewIds;

    /**
     * <p>Prometheus view name.</p>
     * 
     * <strong>example:</strong>
     * <p>view1</p>
     */
    @NameInMap("prometheusViewName")
    public String prometheusViewName;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3gn5i6bigbi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUSVIEW</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>List of tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListPrometheusViewsRequestTag> tag;

    /**
     * <p>Instance version: V1 or V2</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>Workspace name</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListPrometheusViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusViewsRequest self = new ListPrometheusViewsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusViewsRequest setFilterRegionIds(String filterRegionIds) {
        this.filterRegionIds = filterRegionIds;
        return this;
    }
    public String getFilterRegionIds() {
        return this.filterRegionIds;
    }

    public ListPrometheusViewsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusViewsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusViewsRequest setPrometheusViewIds(String prometheusViewIds) {
        this.prometheusViewIds = prometheusViewIds;
        return this;
    }
    public String getPrometheusViewIds() {
        return this.prometheusViewIds;
    }

    public ListPrometheusViewsRequest setPrometheusViewName(String prometheusViewName) {
        this.prometheusViewName = prometheusViewName;
        return this;
    }
    public String getPrometheusViewName() {
        return this.prometheusViewName;
    }

    public ListPrometheusViewsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPrometheusViewsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListPrometheusViewsRequest setTag(java.util.List<ListPrometheusViewsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListPrometheusViewsRequestTag> getTag() {
        return this.tag;
    }

    public ListPrometheusViewsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListPrometheusViewsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class ListPrometheusViewsRequestTag extends TeaModel {
        /**
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Match value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static ListPrometheusViewsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusViewsRequestTag self = new ListPrometheusViewsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListPrometheusViewsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusViewsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
