// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventSubResponseBody body;

    public static DeleteEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventSubResponse self = new DeleteEventSubResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventSubResponse setBody(DeleteEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventSubResponseBody getBody() {
        return this.body;
    }

}
