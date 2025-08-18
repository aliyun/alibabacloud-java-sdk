// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewWuyingServerResponseBody body;

    public static RenewWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewWuyingServerResponse self = new RenewWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public RenewWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewWuyingServerResponse setBody(RenewWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewWuyingServerResponseBody getBody() {
        return this.body;
    }

}
