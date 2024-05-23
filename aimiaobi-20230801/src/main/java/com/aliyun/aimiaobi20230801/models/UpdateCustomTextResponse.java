// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateCustomTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomTextResponseBody body;

    public static UpdateCustomTextResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomTextResponse self = new UpdateCustomTextResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomTextResponse setBody(UpdateCustomTextResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomTextResponseBody getBody() {
        return this.body;
    }

}
