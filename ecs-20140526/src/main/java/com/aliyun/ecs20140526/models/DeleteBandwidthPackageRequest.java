// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteBandwidthPackageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    public static DeleteBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBandwidthPackageRequest self = new DeleteBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

}
