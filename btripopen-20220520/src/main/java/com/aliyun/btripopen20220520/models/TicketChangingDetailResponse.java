// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TicketChangingDetailResponseBody body;

    public static TicketChangingDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingDetailResponse self = new TicketChangingDetailResponse();
        return TeaModel.build(map, self);
    }

    public TicketChangingDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketChangingDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketChangingDetailResponse setBody(TicketChangingDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketChangingDetailResponseBody getBody() {
        return this.body;
    }

}
