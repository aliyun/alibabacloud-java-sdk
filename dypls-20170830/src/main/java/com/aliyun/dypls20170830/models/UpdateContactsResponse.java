// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UpdateContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateContactsResponseBody body;

    public static UpdateContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactsResponse self = new UpdateContactsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContactsResponse setBody(UpdateContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContactsResponseBody getBody() {
        return this.body;
    }

}
