// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetSnapshotCallbackAuthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetSnapshotCallbackAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSnapshotCallbackAuthResponseBody self = new SetSnapshotCallbackAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSnapshotCallbackAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
