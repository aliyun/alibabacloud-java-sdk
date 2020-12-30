// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RefreshClusterResourcePoolRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ResourcePoolId")
    public Long resourcePoolId;

    public static RefreshClusterResourcePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshClusterResourcePoolRequest self = new RefreshClusterResourcePoolRequest();
        return TeaModel.build(map, self);
    }

    public RefreshClusterResourcePoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RefreshClusterResourcePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RefreshClusterResourcePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RefreshClusterResourcePoolRequest setResourcePoolId(Long resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public Long getResourcePoolId() {
        return this.resourcePoolId;
    }

}
