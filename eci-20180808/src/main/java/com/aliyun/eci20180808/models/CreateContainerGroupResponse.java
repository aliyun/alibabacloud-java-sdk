// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    public static CreateContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupResponse self = new CreateContainerGroupResponse();
        return TeaModel.build(map, self);
    }

}
