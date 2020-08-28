// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveBandwidthPackageIpsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RemovedIpAddresses")
    @Validation(required = true)
    public java.util.List<String> removedIpAddresses;

    public static RemoveBandwidthPackageIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBandwidthPackageIpsRequest self = new RemoveBandwidthPackageIpsRequest();
        return TeaModel.build(map, self);
    }

}
