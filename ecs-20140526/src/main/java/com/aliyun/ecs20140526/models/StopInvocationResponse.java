// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInvocationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationResponse self = new StopInvocationResponse();
        return TeaModel.build(map, self);
    }

}
