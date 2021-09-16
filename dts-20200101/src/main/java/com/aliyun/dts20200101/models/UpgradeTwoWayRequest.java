// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class UpgradeTwoWayRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("RegionId")
    public String regionId;

    public static UpgradeTwoWayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeTwoWayRequest self = new UpgradeTwoWayRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeTwoWayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeTwoWayRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public UpgradeTwoWayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
