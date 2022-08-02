// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameArchiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGameArchiveResponseBody body;

    public static DeleteGameArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameArchiveResponse self = new DeleteGameArchiveResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGameArchiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGameArchiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGameArchiveResponse setBody(DeleteGameArchiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGameArchiveResponseBody getBody() {
        return this.body;
    }

}
