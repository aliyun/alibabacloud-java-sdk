// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConsistencyResultJsonStr")
    @Validation(required = true)
    public String consistencyResultJsonStr;

    public static GetConsistencySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotResponse self = new GetConsistencySnapshotResponse();
        return TeaModel.build(map, self);
    }

}
