// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalConnectionResponse self = new DeletePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

}
