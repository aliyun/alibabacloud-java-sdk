// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomerNoteListResponseBody body;

    public static CustomerNoteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteListResponse self = new CustomerNoteListResponse();
        return TeaModel.build(map, self);
    }

    public CustomerNoteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerNoteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerNoteListResponse setBody(CustomerNoteListResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerNoteListResponseBody getBody() {
        return this.body;
    }

}
