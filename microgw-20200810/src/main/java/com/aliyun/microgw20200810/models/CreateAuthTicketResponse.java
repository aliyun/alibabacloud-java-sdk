// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateAuthTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAuthTicketResponseBody body;

    public static CreateAuthTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthTicketResponse self = new CreateAuthTicketResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthTicketResponse setBody(CreateAuthTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthTicketResponseBody getBody() {
        return this.body;
    }

}
