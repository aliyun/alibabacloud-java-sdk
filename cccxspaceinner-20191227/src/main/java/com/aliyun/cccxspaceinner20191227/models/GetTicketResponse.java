// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTicketResponseBody body;

    public static GetTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponse self = new GetTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTicketResponse setBody(GetTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTicketResponseBody getBody() {
        return this.body;
    }

}
