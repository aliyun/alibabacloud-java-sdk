// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InvokeId")
    @Validation(required = true)
    public String invokeId;

    public static InvokeCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandResponse self = new InvokeCommandResponse();
        return TeaModel.build(map, self);
    }

}
