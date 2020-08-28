// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReActivateInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReActivateInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReActivateInstancesResponse self = new ReActivateInstancesResponse();
        return TeaModel.build(map, self);
    }

}
