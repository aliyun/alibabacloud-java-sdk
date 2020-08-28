// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HpcClusterId")
    @Validation(required = true)
    public String hpcClusterId;

    public static CreateHpcClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterResponse self = new CreateHpcClusterResponse();
        return TeaModel.build(map, self);
    }

}
