// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ChangeAuctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAuctionResponseBody body;

    public static ChangeAuctionResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAuctionResponse self = new ChangeAuctionResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAuctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAuctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAuctionResponse setBody(ChangeAuctionResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAuctionResponseBody getBody() {
        return this.body;
    }

}
