// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAuthTicketByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthTicketByIdResponseBody body;

    public static GetAuthTicketByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTicketByIdResponse self = new GetAuthTicketByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthTicketByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthTicketByIdResponse setBody(GetAuthTicketByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthTicketByIdResponseBody getBody() {
        return this.body;
    }

}
