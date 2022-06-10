// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderTransactionDetailFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderTransactionDetailFileResponseBody body;

    public static CreateOrderTransactionDetailFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderTransactionDetailFileResponse self = new CreateOrderTransactionDetailFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderTransactionDetailFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderTransactionDetailFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderTransactionDetailFileResponse setBody(CreateOrderTransactionDetailFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderTransactionDetailFileResponseBody getBody() {
        return this.body;
    }

}
