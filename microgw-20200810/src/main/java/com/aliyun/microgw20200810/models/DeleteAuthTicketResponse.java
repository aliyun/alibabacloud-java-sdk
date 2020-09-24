// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class DeleteAuthTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAuthTicketResponseBody body;

    public static DeleteAuthTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthTicketResponse self = new DeleteAuthTicketResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthTicketResponse setBody(DeleteAuthTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthTicketResponseBody getBody() {
        return this.body;
    }

}
