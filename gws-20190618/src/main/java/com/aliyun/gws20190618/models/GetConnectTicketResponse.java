// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class GetConnectTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnectTicketResponseBody body;

    public static GetConnectTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectTicketResponse self = new GetConnectTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectTicketResponse setBody(GetConnectTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectTicketResponseBody getBody() {
        return this.body;
    }

}
