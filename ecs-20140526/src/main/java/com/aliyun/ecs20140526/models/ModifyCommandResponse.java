// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandResponse self = new ModifyCommandResponse();
        return TeaModel.build(map, self);
    }

}
