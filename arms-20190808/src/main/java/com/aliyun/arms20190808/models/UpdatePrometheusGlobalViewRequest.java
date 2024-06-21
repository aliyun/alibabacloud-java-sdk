// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>To edit a GlobalView aggregated instance, do you require all passed child instances to be verified successfully before creating a GlobalView instance (optional, default to false):</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllSubClustersSuccess")
    public Boolean allSubClustersSuccess;

    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>global****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the global aggregation instance.</p>
     * 
     * <strong>example:</strong>
     * <p>zyGlobalView</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID of the global aggregation instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("MostRegionId")
    public String mostRegionId;

    /**
     * <p>The ID of the region in which the Prometheus instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Prometheus instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The data sources of the Prometheus instance for GlobalView.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;headers&quot;:{ }, &quot;regionId&quot;:&quot;cn-hangzhou&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;extras&quot;:{ }, &quot;clusterId&quot;:&quot;c39a1048921e04f***********&quot;, &quot;sourceName&quot;:&quot;arms-luyao-test&quot;, &quot;dataSource&quot;:&quot;&quot;, &quot;userId&quot;:&quot;1672753***********&quot; }, { &quot;headers&quot;:{ }, &quot;regionId&quot;:&quot;cn-beijing&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;extras&quot;:{ }, &quot;clusterId&quot;:&quot;c6b6485496d5b40***********&quot;, &quot;sourceName&quot;:&quot;agent-321-test&quot;, &quot;dataSource&quot;:&quot;&quot;, &quot;userId&quot;:&quot;1672753***********&quot; }, { &quot;headers&quot;:{ }, &quot;regionId&quot;:&quot;cn-zhangjiakou&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;extras&quot;:{ }, &quot;clusterId&quot;:&quot;c261a4f3200c446***********&quot;, &quot;sourceName&quot;:&quot;zaifeng-cardinality-01&quot;, &quot;dataSource&quot;:&quot;&quot;, &quot;userId&quot;:&quot;1672753***********&quot; } ]</p>
     */
    @NameInMap("SubClustersJson")
    public String subClustersJson;

    public static UpdatePrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusGlobalViewRequest self = new UpdatePrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusGlobalViewRequest setAllSubClustersSuccess(Boolean allSubClustersSuccess) {
        this.allSubClustersSuccess = allSubClustersSuccess;
        return this;
    }
    public Boolean getAllSubClustersSuccess() {
        return this.allSubClustersSuccess;
    }

    public UpdatePrometheusGlobalViewRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdatePrometheusGlobalViewRequest setMostRegionId(String mostRegionId) {
        this.mostRegionId = mostRegionId;
        return this;
    }
    public String getMostRegionId() {
        return this.mostRegionId;
    }

    public UpdatePrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePrometheusGlobalViewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdatePrometheusGlobalViewRequest setSubClustersJson(String subClustersJson) {
        this.subClustersJson = subClustersJson;
        return this;
    }
    public String getSubClustersJson() {
        return this.subClustersJson;
    }

}
