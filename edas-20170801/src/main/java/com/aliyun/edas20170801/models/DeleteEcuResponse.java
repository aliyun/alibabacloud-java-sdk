// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteEcuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEcuResponseBody body;

    public static DeleteEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEcuResponse self = new DeleteEcuResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEcuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEcuResponse setBody(DeleteEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEcuResponseBody getBody() {
        return this.body;
    }

}
