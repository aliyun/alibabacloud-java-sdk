// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteTicketTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTicketTemplateResponseBody body;

    public static DeleteTicketTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTicketTemplateResponse self = new DeleteTicketTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTicketTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTicketTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTicketTemplateResponse setBody(DeleteTicketTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTicketTemplateResponseBody getBody() {
        return this.body;
    }

}
