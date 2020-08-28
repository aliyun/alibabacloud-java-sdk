// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVRouterAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VRouterId")
    @Validation(required = true)
    public String VRouterId;

    @NameInMap("VRouterName")
    public String VRouterName;

    @NameInMap("Description")
    public String description;

    public static ModifyVRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVRouterAttributeRequest self = new ModifyVRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

}
