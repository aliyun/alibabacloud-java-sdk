// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteProductVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionResponseBody self = new DeleteProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
