// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoReleaseTimeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    public static ModifyInstanceAutoReleaseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoReleaseTimeRequest self = new ModifyInstanceAutoReleaseTimeRequest();
        return TeaModel.build(map, self);
    }

}
