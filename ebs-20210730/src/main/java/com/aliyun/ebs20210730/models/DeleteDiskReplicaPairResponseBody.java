// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteDiskReplicaPairResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskReplicaPairResponseBody self = new DeleteDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
