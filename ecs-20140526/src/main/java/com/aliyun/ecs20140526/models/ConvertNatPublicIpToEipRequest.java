// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConvertNatPublicIpToEipRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ConvertNatPublicIpToEipRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertNatPublicIpToEipRequest self = new ConvertNatPublicIpToEipRequest();
        return TeaModel.build(map, self);
    }

    public ConvertNatPublicIpToEipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertNatPublicIpToEipRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
