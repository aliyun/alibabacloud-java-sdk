// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateTicketTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTicketTypeResponseBody body;

    public static CreateTicketTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketTypeResponse self = new CreateTicketTypeResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicketTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicketTypeResponse setBody(CreateTicketTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketTypeResponseBody getBody() {
        return this.body;
    }

}
