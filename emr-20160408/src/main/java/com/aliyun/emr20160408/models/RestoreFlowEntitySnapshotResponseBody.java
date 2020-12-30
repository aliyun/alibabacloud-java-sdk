// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RestoreFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static RestoreFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreFlowEntitySnapshotResponseBody self = new RestoreFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreFlowEntitySnapshotResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
