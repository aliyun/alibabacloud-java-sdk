// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteDiskReplicaGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiskReplicaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskReplicaGroupResponseBody self = new DeleteDiskReplicaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiskReplicaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
