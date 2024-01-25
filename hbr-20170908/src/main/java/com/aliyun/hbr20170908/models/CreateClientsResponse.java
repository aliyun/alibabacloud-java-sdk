// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClientsResponseBody body;

    public static CreateClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClientsResponse self = new CreateClientsResponse();
        return TeaModel.build(map, self);
    }

    public CreateClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClientsResponse setBody(CreateClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClientsResponseBody getBody() {
        return this.body;
    }

}
