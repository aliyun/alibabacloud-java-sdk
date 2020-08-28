// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinResourceGroupRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static JoinResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupRequest self = new JoinResourceGroupRequest();
        return TeaModel.build(map, self);
    }

}
