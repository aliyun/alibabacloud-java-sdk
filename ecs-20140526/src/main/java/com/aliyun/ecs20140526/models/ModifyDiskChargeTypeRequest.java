// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskChargeTypeRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DiskIds")
    @Validation(required = true)
    public String diskIds;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DiskChargeType")
    public String diskChargeType;

    public static ModifyDiskChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskChargeTypeRequest self = new ModifyDiskChargeTypeRequest();
        return TeaModel.build(map, self);
    }

}
