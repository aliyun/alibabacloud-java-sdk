// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateAtiRegistrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAtiRegistrantResponseBody body;

    public static CreateAtiRegistrantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAtiRegistrantResponse self = new CreateAtiRegistrantResponse();
        return TeaModel.build(map, self);
    }

    public CreateAtiRegistrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAtiRegistrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAtiRegistrantResponse setBody(CreateAtiRegistrantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAtiRegistrantResponseBody getBody() {
        return this.body;
    }

}
