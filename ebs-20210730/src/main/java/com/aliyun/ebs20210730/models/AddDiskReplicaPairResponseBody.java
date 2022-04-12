// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class AddDiskReplicaPairResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDiskReplicaPairResponseBody self = new AddDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
