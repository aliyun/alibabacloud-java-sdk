// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallManagedPrometheusRequest extends TeaModel {
    /**
     * <p>__null__</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>code!=200</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("VpcId")
    public String vpcId;

    public static UninstallManagedPrometheusRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallManagedPrometheusRequest self = new UninstallManagedPrometheusRequest();
        return TeaModel.build(map, self);
    }

    public UninstallManagedPrometheusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UninstallManagedPrometheusRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public UninstallManagedPrometheusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UninstallManagedPrometheusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UninstallManagedPrometheusRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
