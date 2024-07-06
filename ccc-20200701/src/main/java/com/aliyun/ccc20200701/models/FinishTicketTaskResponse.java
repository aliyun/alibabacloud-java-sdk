// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class FinishTicketTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishTicketTaskResponseBody body;

    public static FinishTicketTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishTicketTaskResponse self = new FinishTicketTaskResponse();
        return TeaModel.build(map, self);
    }

    public FinishTicketTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishTicketTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishTicketTaskResponse setBody(FinishTicketTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishTicketTaskResponseBody getBody() {
        return this.body;
    }

}
