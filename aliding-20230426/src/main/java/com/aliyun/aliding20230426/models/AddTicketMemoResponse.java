// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddTicketMemoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTicketMemoResponseBody body;

    public static AddTicketMemoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTicketMemoResponse self = new AddTicketMemoResponse();
        return TeaModel.build(map, self);
    }

    public AddTicketMemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTicketMemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTicketMemoResponse setBody(AddTicketMemoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTicketMemoResponseBody getBody() {
        return this.body;
    }

}
