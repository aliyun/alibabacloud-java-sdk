// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImageComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageComponentResponseBody body;

    public static DeleteImageComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageComponentResponse self = new DeleteImageComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageComponentResponse setBody(DeleteImageComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageComponentResponseBody getBody() {
        return this.body;
    }

}
