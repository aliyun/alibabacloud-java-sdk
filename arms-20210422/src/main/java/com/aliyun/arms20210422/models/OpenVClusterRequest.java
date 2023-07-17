// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class OpenVClusterRequest extends TeaModel {
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Product")
    public String product;

    @NameInMap("RecreateSwitch")
    public Boolean recreateSwitch;

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
