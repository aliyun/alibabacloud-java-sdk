// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateSubTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubTicketResponseBody body;

    public static CreateSubTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubTicketResponse self = new CreateSubTicketResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubTicketResponse setBody(CreateSubTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubTicketResponseBody getBody() {
        return this.body;
    }

}
