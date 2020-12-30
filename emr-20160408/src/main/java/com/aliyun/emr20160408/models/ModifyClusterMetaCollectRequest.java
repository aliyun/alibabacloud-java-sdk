// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterMetaCollectRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("SwitchOn")
    public Boolean switchOn;

    public static ModifyClusterMetaCollectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterMetaCollectRequest self = new ModifyClusterMetaCollectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterMetaCollectRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyClusterMetaCollectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyClusterMetaCollectRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterMetaCollectRequest setSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
        return this;
    }
    public Boolean getSwitchOn() {
        return this.switchOn;
    }

}
