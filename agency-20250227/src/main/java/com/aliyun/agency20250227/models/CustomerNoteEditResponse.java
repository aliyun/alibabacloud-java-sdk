// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteEditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomerNoteEditResponseBody body;

    public static CustomerNoteEditResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteEditResponse self = new CustomerNoteEditResponse();
        return TeaModel.build(map, self);
    }

    public CustomerNoteEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerNoteEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerNoteEditResponse setBody(CustomerNoteEditResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerNoteEditResponseBody getBody() {
        return this.body;
    }

}
