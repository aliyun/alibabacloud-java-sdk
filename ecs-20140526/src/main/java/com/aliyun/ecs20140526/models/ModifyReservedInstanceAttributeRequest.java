// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ReservedInstanceId")
    @Validation(required = true)
    public String reservedInstanceId;

    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("Description")
    public String description;

    public static ModifyReservedInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceAttributeRequest self = new ModifyReservedInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
