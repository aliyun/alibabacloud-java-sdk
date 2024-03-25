// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCenResponseBody body;

    public static DeleteCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenResponse self = new DeleteCenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCenResponse setBody(DeleteCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenResponseBody getBody() {
        return this.body;
    }

}
