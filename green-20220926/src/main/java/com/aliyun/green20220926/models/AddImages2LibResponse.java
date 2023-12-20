// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImages2LibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddImages2LibResponseBody body;

    public static AddImages2LibResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImages2LibResponse self = new AddImages2LibResponse();
        return TeaModel.build(map, self);
    }

    public AddImages2LibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImages2LibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImages2LibResponse setBody(AddImages2LibResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImages2LibResponseBody getBody() {
        return this.body;
    }

}
