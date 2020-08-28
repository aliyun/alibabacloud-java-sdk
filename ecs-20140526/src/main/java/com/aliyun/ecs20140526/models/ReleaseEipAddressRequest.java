// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AllocationId")
    @Validation(required = true)
    public String allocationId;

    public static ReleaseEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressRequest self = new ReleaseEipAddressRequest();
        return TeaModel.build(map, self);
    }

}
