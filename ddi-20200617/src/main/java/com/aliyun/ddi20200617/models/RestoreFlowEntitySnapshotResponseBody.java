// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RestoreFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static RestoreFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreFlowEntitySnapshotResponseBody self = new RestoreFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreFlowEntitySnapshotResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RestoreFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
