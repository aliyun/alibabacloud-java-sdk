// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallManagedPrometheusRequest extends TeaModel {
    // The ID of the ASK cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The type of the cluster. You can query the dashboards of a virtual cluster by specifying the cluster type.
    @NameInMap("ClusterType")
    public String clusterType;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The VPC of the ASK cluster.
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

    public UninstallManagedPrometheusRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
