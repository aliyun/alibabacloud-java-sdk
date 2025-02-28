// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterVpcConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateClusterVpcConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterVpcConnectionResponseBody self = new AllocateClusterVpcConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateClusterVpcConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
