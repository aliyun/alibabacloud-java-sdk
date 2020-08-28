// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AddBandwidthPackageIpsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("IpCount")
    @Validation(required = true)
    public String ipCount;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddBandwidthPackageIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBandwidthPackageIpsRequest self = new AddBandwidthPackageIpsRequest();
        return TeaModel.build(map, self);
    }

}
