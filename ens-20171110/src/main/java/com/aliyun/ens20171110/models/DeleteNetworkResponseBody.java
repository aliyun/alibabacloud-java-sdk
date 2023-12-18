// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkResponseBody self = new DeleteNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
