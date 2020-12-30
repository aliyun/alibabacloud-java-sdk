// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ValidateShardTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateShardTaskResponseBody body;

    public static ValidateShardTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateShardTaskResponse self = new ValidateShardTaskResponse();
        return TeaModel.build(map, self);
    }

    public ValidateShardTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateShardTaskResponse setBody(ValidateShardTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateShardTaskResponseBody getBody() {
        return this.body;
    }

}
