// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressRequest self = new AllocateEipAddressRequest();
        return TeaModel.build(map, self);
    }

}
