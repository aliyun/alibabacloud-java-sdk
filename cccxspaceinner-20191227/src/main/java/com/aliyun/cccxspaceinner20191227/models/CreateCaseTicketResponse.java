// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateCaseTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCaseTicketResponseBody body;

    public static CreateCaseTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCaseTicketResponse self = new CreateCaseTicketResponse();
        return TeaModel.build(map, self);
    }

    public CreateCaseTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCaseTicketResponse setBody(CreateCaseTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCaseTicketResponseBody getBody() {
        return this.body;
    }

}
