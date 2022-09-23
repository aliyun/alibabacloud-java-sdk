// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UpdatePoolNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePoolNameResponseBody body;

    public static UpdatePoolNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePoolNameResponse self = new UpdatePoolNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePoolNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePoolNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePoolNameResponse setBody(UpdatePoolNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePoolNameResponseBody getBody() {
        return this.body;
    }

}
