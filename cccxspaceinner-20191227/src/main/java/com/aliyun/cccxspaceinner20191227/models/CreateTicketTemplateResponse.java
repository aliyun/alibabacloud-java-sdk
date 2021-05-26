// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateTicketTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTicketTemplateResponseBody body;

    public static CreateTicketTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketTemplateResponse self = new CreateTicketTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicketTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicketTemplateResponse setBody(CreateTicketTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketTemplateResponseBody getBody() {
        return this.body;
    }

}
