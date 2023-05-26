// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenVClusterRequest extends TeaModel {
    /**
     * <p>The type of the cluster. For cloud services, set this parameter to `cloud-product-prometheus`.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The length of the cluster ID. Default value: 10.</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The name of the cloud service. This parameter must be specified when ClusterType is set to `cloud-product-prometheus`. Valid values: influxdb, mongodb, and DLA. You cannot specify multiple service names.</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>Specifies whether to create or query a virtual cluster. This parameter provides backward compatibility.</p>
     */
    @NameInMap("RecreateSwitch")
    public Boolean recreateSwitch;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static OpenVClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenVClusterRequest self = new OpenVClusterRequest();
        return TeaModel.build(map, self);
    }

    public OpenVClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public OpenVClusterRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public OpenVClusterRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public OpenVClusterRequest setRecreateSwitch(Boolean recreateSwitch) {
        this.recreateSwitch = recreateSwitch;
        return this;
    }
    public Boolean getRecreateSwitch() {
        return this.recreateSwitch;
    }

    public OpenVClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
