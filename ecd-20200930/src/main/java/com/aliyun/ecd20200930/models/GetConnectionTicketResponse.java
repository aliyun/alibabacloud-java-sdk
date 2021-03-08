// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnectionTicketResponseBody body;

    public static GetConnectionTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketResponse self = new GetConnectionTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectionTicketResponse setBody(GetConnectionTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectionTicketResponseBody getBody() {
        return this.body;
    }

}
