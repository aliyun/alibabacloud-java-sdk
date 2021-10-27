// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitCleanTableShardingKeyModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitCleanTableShardingKeyModifyResponseBody body;

    public static SubmitCleanTableShardingKeyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCleanTableShardingKeyModifyResponse self = new SubmitCleanTableShardingKeyModifyResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCleanTableShardingKeyModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCleanTableShardingKeyModifyResponse setBody(SubmitCleanTableShardingKeyModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCleanTableShardingKeyModifyResponseBody getBody() {
        return this.body;
    }

}
