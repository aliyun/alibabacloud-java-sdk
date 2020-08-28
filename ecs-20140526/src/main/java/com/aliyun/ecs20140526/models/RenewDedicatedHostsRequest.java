// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewDedicatedHostsRequest extends TeaModel {
    @NameInMap("DedicatedHostIds")
    @Validation(required = true)
    public String dedicatedHostIds;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Period")
    @Validation(required = true)
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ClientToken")
    public String clientToken;

    public static RenewDedicatedHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewDedicatedHostsRequest self = new RenewDedicatedHostsRequest();
        return TeaModel.build(map, self);
    }

}
