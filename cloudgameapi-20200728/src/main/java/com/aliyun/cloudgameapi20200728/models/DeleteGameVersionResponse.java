// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGameVersionResponseBody body;

    public static DeleteGameVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameVersionResponse self = new DeleteGameVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGameVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGameVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGameVersionResponse setBody(DeleteGameVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGameVersionResponseBody getBody() {
        return this.body;
    }

}
