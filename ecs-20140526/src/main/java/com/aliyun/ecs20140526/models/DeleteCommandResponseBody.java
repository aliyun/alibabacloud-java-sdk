// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommandResponseBody self = new DeleteCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
