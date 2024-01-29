// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeletePlayInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePlayInfoResponseBody body;

    public static DeletePlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePlayInfoResponse self = new DeletePlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeletePlayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePlayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePlayInfoResponse setBody(DeletePlayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePlayInfoResponseBody getBody() {
        return this.body;
    }

}
