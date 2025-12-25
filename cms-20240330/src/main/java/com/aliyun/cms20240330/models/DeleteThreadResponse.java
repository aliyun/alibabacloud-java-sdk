// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteThreadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteThreadResponseBody body;

    public static DeleteThreadResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteThreadResponse self = new DeleteThreadResponse();
        return TeaModel.build(map, self);
    }

    public DeleteThreadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteThreadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteThreadResponse setBody(DeleteThreadResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteThreadResponseBody getBody() {
        return this.body;
    }

}
