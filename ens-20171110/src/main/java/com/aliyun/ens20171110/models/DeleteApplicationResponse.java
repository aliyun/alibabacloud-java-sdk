// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationResponseBody body;

    public static DeleteApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationResponse self = new DeleteApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationResponse setBody(DeleteApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationResponseBody getBody() {
        return this.body;
    }

}
