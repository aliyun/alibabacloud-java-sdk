// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class GetCoordinationTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCoordinationTicketResponseBody body;

    public static GetCoordinationTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinationTicketResponse self = new GetCoordinationTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetCoordinationTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCoordinationTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCoordinationTicketResponse setBody(GetCoordinationTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCoordinationTicketResponseBody getBody() {
        return this.body;
    }

}
