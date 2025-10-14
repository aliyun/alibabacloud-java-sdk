// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetLogTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogTicketResponseBody body;

    public static GetLogTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogTicketResponse self = new GetLogTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetLogTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogTicketResponse setBody(GetLogTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogTicketResponseBody getBody() {
        return this.body;
    }

}
