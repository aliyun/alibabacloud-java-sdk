// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteRpcServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRpcServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRpcServiceResponseBody self = new DeleteRpcServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRpcServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
