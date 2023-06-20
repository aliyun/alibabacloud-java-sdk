// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodepoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static DeleteClusterNodepoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodepoolResponseBody self = new DeleteClusterNodepoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodepoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
