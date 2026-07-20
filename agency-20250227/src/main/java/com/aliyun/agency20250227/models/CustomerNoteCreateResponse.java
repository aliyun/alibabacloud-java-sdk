// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomerNoteCreateResponseBody body;

    public static CustomerNoteCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteCreateResponse self = new CustomerNoteCreateResponse();
        return TeaModel.build(map, self);
    }

    public CustomerNoteCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerNoteCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerNoteCreateResponse setBody(CustomerNoteCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerNoteCreateResponseBody getBody() {
        return this.body;
    }

}
