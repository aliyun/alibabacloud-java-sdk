// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateClusterPublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionResponseBody self = new AllocateClusterPublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
