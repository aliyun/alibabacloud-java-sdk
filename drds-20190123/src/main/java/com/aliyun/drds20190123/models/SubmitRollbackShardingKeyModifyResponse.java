// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitRollbackShardingKeyModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitRollbackShardingKeyModifyResponseBody body;

    public static SubmitRollbackShardingKeyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitRollbackShardingKeyModifyResponse self = new SubmitRollbackShardingKeyModifyResponse();
        return TeaModel.build(map, self);
    }

    public SubmitRollbackShardingKeyModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitRollbackShardingKeyModifyResponse setBody(SubmitRollbackShardingKeyModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitRollbackShardingKeyModifyResponseBody getBody() {
        return this.body;
    }

}
