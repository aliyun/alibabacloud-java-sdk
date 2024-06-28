// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ResubmitTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResubmitTicketResponseBody body;

    public static ResubmitTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        ResubmitTicketResponse self = new ResubmitTicketResponse();
        return TeaModel.build(map, self);
    }

    public ResubmitTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResubmitTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResubmitTicketResponse setBody(ResubmitTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public ResubmitTicketResponseBody getBody() {
        return this.body;
    }

}
