// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteProductVersionConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionConfigResponseBody self = new DeleteProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
