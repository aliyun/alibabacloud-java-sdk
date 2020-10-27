// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandResponse self = new DeleteCommandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
