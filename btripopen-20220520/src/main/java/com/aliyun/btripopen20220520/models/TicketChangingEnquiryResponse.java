// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingEnquiryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TicketChangingEnquiryResponseBody body;

    public static TicketChangingEnquiryResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingEnquiryResponse self = new TicketChangingEnquiryResponse();
        return TeaModel.build(map, self);
    }

    public TicketChangingEnquiryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketChangingEnquiryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketChangingEnquiryResponse setBody(TicketChangingEnquiryResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketChangingEnquiryResponseBody getBody() {
        return this.body;
    }

}
