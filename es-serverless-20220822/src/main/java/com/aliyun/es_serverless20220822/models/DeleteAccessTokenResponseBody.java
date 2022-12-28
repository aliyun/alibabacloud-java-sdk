// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class DeleteAccessTokenResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessTokenResponseBody self = new DeleteAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
