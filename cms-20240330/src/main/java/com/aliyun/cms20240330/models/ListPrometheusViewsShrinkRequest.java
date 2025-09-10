// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusViewsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou,cn-beijing</p>
     */
    @NameInMap("filterRegionIds")
    public String filterRegionIds;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>44ANBjKZmQeKnaB1fXRq06w7sFYK3MUcCALMD9qQbmEiE</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>view-xxx</p>
     */
    @NameInMap("prometheusViewIds")
    public String prometheusViewIds;

    /**
     * <strong>example:</strong>
     * <p>view1</p>
     */
    @NameInMap("prometheusViewName")
    public String prometheusViewName;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm3gn5i6bigbi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>PROMETHEUSVIEW</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("tag")
    public String tagShrink;

    /**
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListPrometheusViewsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusViewsShrinkRequest self = new ListPrometheusViewsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusViewsShrinkRequest setFilterRegionIds(String filterRegionIds) {
        this.filterRegionIds = filterRegionIds;
        return this;
    }
    public String getFilterRegionIds() {
        return this.filterRegionIds;
    }

    public ListPrometheusViewsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusViewsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusViewsShrinkRequest setPrometheusViewIds(String prometheusViewIds) {
        this.prometheusViewIds = prometheusViewIds;
        return this;
    }
    public String getPrometheusViewIds() {
        return this.prometheusViewIds;
    }

    public ListPrometheusViewsShrinkRequest setPrometheusViewName(String prometheusViewName) {
        this.prometheusViewName = prometheusViewName;
        return this;
    }
    public String getPrometheusViewName() {
        return this.prometheusViewName;
    }

    public ListPrometheusViewsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPrometheusViewsShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListPrometheusViewsShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListPrometheusViewsShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListPrometheusViewsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
