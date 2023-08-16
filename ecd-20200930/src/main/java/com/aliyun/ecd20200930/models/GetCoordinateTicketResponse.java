// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetCoordinateTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCoordinateTicketResponseBody body;

    public static GetCoordinateTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinateTicketResponse self = new GetCoordinateTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetCoordinateTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCoordinateTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCoordinateTicketResponse setBody(GetCoordinateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCoordinateTicketResponseBody getBody() {
        return this.body;
    }

}
