// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateContactResponseBody body;

    public static CreateOrUpdateContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactResponse self = new CreateOrUpdateContactResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateContactResponse setBody(CreateOrUpdateContactResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateContactResponseBody getBody() {
        return this.body;
    }

}
