// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCustomHostnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomHostnameResponseBody body;

    public static DeleteCustomHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomHostnameResponse self = new DeleteCustomHostnameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomHostnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomHostnameResponse setBody(DeleteCustomHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomHostnameResponseBody getBody() {
        return this.body;
    }

}
