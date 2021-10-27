// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitTableShardingKeyModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTableShardingKeyModifyResponseBody body;

    public static SubmitTableShardingKeyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTableShardingKeyModifyResponse self = new SubmitTableShardingKeyModifyResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTableShardingKeyModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTableShardingKeyModifyResponse setBody(SubmitTableShardingKeyModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTableShardingKeyModifyResponseBody getBody() {
        return this.body;
    }

}
