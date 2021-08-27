// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteReplicaPairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicaPairResponseBody self = new DeleteReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
