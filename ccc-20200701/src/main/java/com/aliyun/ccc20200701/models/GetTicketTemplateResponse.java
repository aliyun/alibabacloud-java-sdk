// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTicketTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTicketTemplateResponseBody body;

    public static GetTicketTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTicketTemplateResponse self = new GetTicketTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTicketTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTicketTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTicketTemplateResponse setBody(GetTicketTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTicketTemplateResponseBody getBody() {
        return this.body;
    }

}
