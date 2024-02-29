// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTicketResponseBody body;

    public static UpdateTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketResponse self = new UpdateTicketResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTicketResponse setBody(UpdateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketResponseBody getBody() {
        return this.body;
    }

}
