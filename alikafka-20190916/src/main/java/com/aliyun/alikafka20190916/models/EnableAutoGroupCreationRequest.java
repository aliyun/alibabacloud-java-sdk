// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoGroupCreationRequest extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableAutoGroupCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoGroupCreationRequest self = new EnableAutoGroupCreationRequest();
        return TeaModel.build(map, self);
    }

    public EnableAutoGroupCreationRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EnableAutoGroupCreationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableAutoGroupCreationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
