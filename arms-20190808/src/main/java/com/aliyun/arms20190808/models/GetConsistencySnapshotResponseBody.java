// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConsistencyResultJsonStr")
    public String consistencyResultJsonStr;

    public static GetConsistencySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotResponseBody self = new GetConsistencySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsistencySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsistencySnapshotResponseBody setConsistencyResultJsonStr(String consistencyResultJsonStr) {
        this.consistencyResultJsonStr = consistencyResultJsonStr;
        return this;
    }
    public String getConsistencyResultJsonStr() {
        return this.consistencyResultJsonStr;
    }

}
