// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>创建GlobalView时，是否要求所有子实例都校验成功时，才创建GlobalView实例。默认是false，即可以部分成功。</p>
     */
    @NameInMap("AllSubClustersSuccess")
    public Boolean allSubClustersSuccess;

    /**
     * <p>The ID of the Prometheus instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("MostRegionId")
    public String mostRegionId;

    @NameInMap("ParamJson")
    public String paramJson;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Prometheus instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The data sources of the global aggregation instance.</p>
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

    public UpdatePrometheusGlobalViewRequest setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }
    public String getParamJson() {
        return this.paramJson;
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
