// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAppSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSecretResponse self = new DeleteAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppSecretResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
