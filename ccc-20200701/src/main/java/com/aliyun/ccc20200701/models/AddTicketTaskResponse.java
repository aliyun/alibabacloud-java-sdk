// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddTicketTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTicketTaskResponseBody body;

    public static AddTicketTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTicketTaskResponse self = new AddTicketTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddTicketTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTicketTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTicketTaskResponse setBody(AddTicketTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTicketTaskResponseBody getBody() {
        return this.body;
    }

}
