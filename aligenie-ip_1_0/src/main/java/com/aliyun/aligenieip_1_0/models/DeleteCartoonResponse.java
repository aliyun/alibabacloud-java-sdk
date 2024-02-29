// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteCartoonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCartoonResponseBody body;

    public static DeleteCartoonResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCartoonResponse self = new DeleteCartoonResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCartoonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCartoonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCartoonResponse setBody(DeleteCartoonResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCartoonResponseBody getBody() {
        return this.body;
    }

}
