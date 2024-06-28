// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DisableTicketTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableTicketTemplateResponseBody body;

    public static DisableTicketTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableTicketTemplateResponse self = new DisableTicketTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DisableTicketTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableTicketTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableTicketTemplateResponse setBody(DisableTicketTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableTicketTemplateResponseBody getBody() {
        return this.body;
    }

}
