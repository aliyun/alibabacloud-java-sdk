// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteDNADBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDNADBResponseBody body;

    public static DeleteDNADBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNADBResponse self = new DeleteDNADBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDNADBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDNADBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDNADBResponse setBody(DeleteDNADBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDNADBResponseBody getBody() {
        return this.body;
    }

}
