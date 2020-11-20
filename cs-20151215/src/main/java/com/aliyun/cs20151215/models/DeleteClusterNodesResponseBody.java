// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("requestId")
    public String requestId;

    public static DeleteClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesResponseBody self = new DeleteClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
