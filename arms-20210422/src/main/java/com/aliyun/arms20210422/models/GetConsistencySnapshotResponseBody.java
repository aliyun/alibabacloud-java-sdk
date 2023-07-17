// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotResponseBody extends TeaModel {
    @NameInMap("ConsistencyResultJsonStr")
    public String consistencyResultJsonStr;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConsistencySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotResponseBody self = new GetConsistencySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsistencySnapshotResponseBody setConsistencyResultJsonStr(String consistencyResultJsonStr) {
        this.consistencyResultJsonStr = consistencyResultJsonStr;
        return this;
    }
    public String getConsistencyResultJsonStr() {
        return this.consistencyResultJsonStr;
    }

    public GetConsistencySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
