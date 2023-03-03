// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetManagedPrometheusStatusRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the cluster. Set the value to ask.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>ClusterType为“ecs”时，必填。</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetManagedPrometheusStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetManagedPrometheusStatusRequest self = new GetManagedPrometheusStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetManagedPrometheusStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetManagedPrometheusStatusRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public GetManagedPrometheusStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetManagedPrometheusStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetManagedPrometheusStatusRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
