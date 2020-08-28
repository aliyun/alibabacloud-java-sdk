// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CommandId")
    @Validation(required = true)
    public String commandId;

    public static CreateCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponse self = new CreateCommandResponse();
        return TeaModel.build(map, self);
    }

}
