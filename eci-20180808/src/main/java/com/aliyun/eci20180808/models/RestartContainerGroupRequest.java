// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class RestartContainerGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static RestartContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartContainerGroupRequest self = new RestartContainerGroupRequest();
        return TeaModel.build(map, self);
    }

}
