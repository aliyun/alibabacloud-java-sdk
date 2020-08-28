// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("HaVipId")
    @Validation(required = true)
    public String haVipId;

    @NameInMap("Description")
    public String description;

    public static ModifyHaVipAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHaVipAttributeRequest self = new ModifyHaVipAttributeRequest();
        return TeaModel.build(map, self);
    }

}
