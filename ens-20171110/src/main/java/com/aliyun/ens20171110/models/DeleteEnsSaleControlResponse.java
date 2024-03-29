// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnsSaleControlResponseBody body;

    public static DeleteEnsSaleControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleControlResponse self = new DeleteEnsSaleControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnsSaleControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnsSaleControlResponse setBody(DeleteEnsSaleControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnsSaleControlResponseBody getBody() {
        return this.body;
    }

}
