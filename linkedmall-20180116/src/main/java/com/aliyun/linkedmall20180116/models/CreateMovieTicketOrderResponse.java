// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateMovieTicketOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMovieTicketOrderResponseBody body;

    public static CreateMovieTicketOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMovieTicketOrderResponse self = new CreateMovieTicketOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateMovieTicketOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMovieTicketOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMovieTicketOrderResponse setBody(CreateMovieTicketOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMovieTicketOrderResponseBody getBody() {
        return this.body;
    }

}
