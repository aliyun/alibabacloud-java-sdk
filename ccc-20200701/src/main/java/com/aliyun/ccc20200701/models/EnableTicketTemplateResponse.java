// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class EnableTicketTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableTicketTemplateResponseBody body;

    public static EnableTicketTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableTicketTemplateResponse self = new EnableTicketTemplateResponse();
        return TeaModel.build(map, self);
    }

    public EnableTicketTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableTicketTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableTicketTemplateResponse setBody(EnableTicketTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableTicketTemplateResponseBody getBody() {
        return this.body;
    }

}
