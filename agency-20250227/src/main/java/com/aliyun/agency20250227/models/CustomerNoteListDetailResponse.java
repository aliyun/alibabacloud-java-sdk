// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomerNoteListDetailResponseBody body;

    public static CustomerNoteListDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteListDetailResponse self = new CustomerNoteListDetailResponse();
        return TeaModel.build(map, self);
    }

    public CustomerNoteListDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerNoteListDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerNoteListDetailResponse setBody(CustomerNoteListDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerNoteListDetailResponseBody getBody() {
        return this.body;
    }

}
