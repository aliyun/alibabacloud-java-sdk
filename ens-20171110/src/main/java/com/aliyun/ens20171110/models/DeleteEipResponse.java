// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEipResponseBody body;

    public static DeleteEipResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEipResponse self = new DeleteEipResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEipResponse setBody(DeleteEipResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEipResponseBody getBody() {
        return this.body;
    }

}
