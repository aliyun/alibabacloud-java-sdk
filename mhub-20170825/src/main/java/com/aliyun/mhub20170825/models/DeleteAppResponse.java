// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DeleteAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResponse self = new DeleteAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
