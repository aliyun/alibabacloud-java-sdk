// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateContactByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContactByIdResponseBody body;

    public static UpdateContactByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactByIdResponse self = new UpdateContactByIdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContactByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContactByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContactByIdResponse setBody(UpdateContactByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContactByIdResponseBody getBody() {
        return this.body;
    }

}
