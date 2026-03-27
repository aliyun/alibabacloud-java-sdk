// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesShrinkRequest extends TeaModel {
    /**
     * <p>Specified list of regionIds to filter (comma-separated).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("filterRegionIds")
    public String filterRegionIds;

    /**
     * <p>Maximum number of records to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>xxxxxxxxxx</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>List of instance IDs (comma-separated)</p>
     * 
     * <strong>example:</strong>
     * <p>rw-00001,rw-00002,rw-00003</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("prometheusInstanceIds")
    public String prometheusInstanceIds;

    /**
     * <p>Instance name (partial match supported)</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2bhocin5e2na</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Prometheus</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>List of tags.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    /**
     * <p>Instance version: V1 or V2</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListPrometheusInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesShrinkRequest self = new ListPrometheusInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesShrinkRequest setFilterRegionIds(String filterRegionIds) {
        this.filterRegionIds = filterRegionIds;
        return this;
    }
    public String getFilterRegionIds() {
        return this.filterRegionIds;
    }

    public ListPrometheusInstancesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusInstancesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusInstancesShrinkRequest setPrometheusInstanceIds(String prometheusInstanceIds) {
        this.prometheusInstanceIds = prometheusInstanceIds;
        return this;
    }
    public String getPrometheusInstanceIds() {
        return this.prometheusInstanceIds;
    }

    public ListPrometheusInstancesShrinkRequest setPrometheusInstanceName(String prometheusInstanceName) {
        this.prometheusInstanceName = prometheusInstanceName;
        return this;
    }
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
    }

    public ListPrometheusInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPrometheusInstancesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListPrometheusInstancesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListPrometheusInstancesShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListPrometheusInstancesShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
