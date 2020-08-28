// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static CreateHpcClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterRequest self = new CreateHpcClusterRequest();
        return TeaModel.build(map, self);
    }

}
