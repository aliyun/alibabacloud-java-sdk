// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetTicketsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTicketsInfoResponseBody body;

    public static GetTicketsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTicketsInfoResponse self = new GetTicketsInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTicketsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTicketsInfoResponse setBody(GetTicketsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTicketsInfoResponseBody getBody() {
        return this.body;
    }

}
