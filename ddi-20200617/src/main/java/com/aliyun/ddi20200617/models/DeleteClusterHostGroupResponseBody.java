// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteClusterHostGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClusterHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterHostGroupResponseBody self = new DeleteClusterHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
